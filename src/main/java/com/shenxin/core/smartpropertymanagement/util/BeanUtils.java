package com.shenxin.core.smartpropertymanagement.util;

import com.esotericsoftware.reflectasm.FieldAccess;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.shenxin.core.smartpropertymanagement.domain.em.FiledAlias;
import com.shenxin.core.smartpropertymanagement.util.exception.ValidatorException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class BeanUtils {

    private static ObjectMapper mapper = new ObjectMapper();

    static ThreadLocal<Map<Class, Map<String, Field>>> fieldCache = new ThreadLocal<>();

    static ThreadLocal<Map<Class, FieldAccess>> proxyCache = new ThreadLocal<>();

    static {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }

    public static <T> T json2Object(String json, Class<T> c) {
        try {
            return mapper.readValue(json, c);
        } catch (IOException e) {
            log.error("json 转换 {} 异常", c.getName(), e);
        }
        return null;
    }

    public static Object json2Object(String json, Class<?> c1, Class<?>... c2) {
        try {
            JavaType javaType = mapper.getTypeFactory().constructParametricType(c1, c2);
            return mapper.readValue(json, javaType);
        } catch (IOException e) {
            log.error("json 转换 {} 异常", c1.getName(), e);
        }
        return null;
    }

    public static String object2Json(Object o) {
        try {
            return mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            log.error("object:[{}] 转换 string 异常", o, e);
        }
        return null;
    }

    public static void validateJSR303(Validator validator, Object o) throws ValidatorException {
        BindingResult result = new BeanPropertyBindingResult(o, o.getClass().getName());
        validator.validate(o, result);
        List<ObjectError> allErrors = result.getAllErrors();
        if (allErrors != null && allErrors.size() > 0) {
            String errorMessage = "";
            for (ObjectError error : allErrors) {
                errorMessage += "【" + error.getDefaultMessage() + "】";
            }
            throw new ValidatorException(errorMessage);
        }
    }

    public static void setNull(Object src, String filedName) throws Exception {
        if (PropertyUtils.isWriteable(src, filedName)) {
            org.apache.commons.beanutils.BeanUtils.copyProperty(src, filedName, null);
        }
    }

    public static void copy(Object src, Object desc) throws Exception {
        Optional.ofNullable(PropertyUtils.getPropertyDescriptors(desc))
                .filter(_propertys -> _propertys.length > 0)
                .map(_propertys -> Arrays.asList(_propertys))
                .ifPresent(_propertys -> {
                    _propertys.stream()
                            .filter(_property -> !"class".equals(_property.getName()))
                            .forEach(_property -> {
                                String descName = _property.getName();
                                String srcName = descName;
                                Field descField = findField(desc.getClass(), descName, null);
                                if (descField == null || !PropertyUtils.isWriteable(desc, descName)) return;
                                if (descField.isAnnotationPresent(FiledAlias.class)) {
                                    try {
                                        srcName = Optional.ofNullable(descField.getAnnotation(FiledAlias.class).value())
                                                .map(alias -> Arrays.stream(alias).filter(_srcName -> PropertyUtils.isReadable(src, _srcName)).collect(Collectors.toList()))
                                                .filter(_srcName -> _srcName.size() == 1)
                                                .map(_srcName -> _srcName.get(0))
                                                .orElse(srcName);
                                    } catch (Exception e) {
                                    }
                                }
                                try {
                                    Object value = PropertyUtils.getProperty(src, srcName);
                                    if (descField.isAnnotationPresent(FiledAlias.class)) {
                                        FiledAlias filedAlias = descField.getAnnotation(FiledAlias.class);
                                        boolean isCollection = filedAlias.isCollection();
                                        boolean isGetCollectionSize = filedAlias.isGetCollectionSize();
                                        int index = filedAlias.index();
                                        String subAlias = filedAlias.subAlias();

                                        if (isCollection && isGetCollectionSize) {
                                            value = ((Collection) value).size();
                                        }
                                        if (isCollection && StringUtils.isNotBlank(subAlias)) {
                                            Object[] _tmp = ((Collection) value).toArray();
                                            if (_tmp != null && _tmp.length > index) {
                                                Object subObj = _tmp[index];
                                                value = PropertyUtils.getProperty(subObj, filedAlias.subAlias());
                                            }
                                        }
                                    }

                                    if (value != null) {
                                        if (descField != null && "interface java.util.List".equals(descField.getType().toString())) {
                                            Field srcField = findField(src.getClass(), srcName, null);
                                            Class srcClass = (Class) ((ParameterizedType) srcField.getGenericType()).getActualTypeArguments()[0];
                                            Class descClass = (Class) ((ParameterizedType) descField.getGenericType()).getActualTypeArguments()[0];
                                            if (srcClass != descClass)
                                                value = copyList((List) value, descClass);
                                        }
                                        copyProperty(desc, descName, value);
                                    }
                                } catch (Exception e) {

                                }
                            });
                });
    }

    private static void copyProperty(Object desc, String descName, Object value) throws Exception {
        try {
            Class descClassz = desc.getClass();
            Map<Class, FieldAccess> cache = proxyCache.get();
            if (cache == null) {
                cache = new WeakHashMap<>();
                proxyCache.set(cache);
            }
            FieldAccess access = cache.get(descClassz);
            if (access == null) {
                access = FieldAccess.get(desc.getClass());
                cache.put(descClassz, access);
            }
            access.set(desc, descName, value);
        } catch (Exception e) {
            org.apache.commons.beanutils.BeanUtils.copyProperty(desc, descName, value);
        }
    }


    public static <T> List<T> copyList(List src, Class<T> c) {
        List<T> desc = new ArrayList<>();
        if(src != null){
            src.stream().forEach(o -> {
                try {
                    T t = c.newInstance();
                    copy(o, t);
                    desc.add(t);
                } catch (Exception e) {
                }
            });
        }
        return desc;
    }

    public static Field findField(Class<?> clazz, String name, Class<?> type) {
        Map<Class, Map<String, Field>> cache = fieldCache.get();
        if (cache == null) {
            cache = new WeakHashMap<>();
            fieldCache.set(cache);
        }
        Map<String, Field> fieldMap = cache.get(clazz);
        if (fieldMap == null) {
            fieldMap = new WeakHashMap<>();
            cache.put(clazz, fieldMap);
        }
        Field field = fieldMap.get(name);
        if (field == null) {
            field = getField(clazz, name, type);
            fieldMap.put(name, field);
        }
        return field;
    }

    private static Field getField(Class<?> clazz, String name, Class<?> type) {
        Class<?> searchType = clazz;
        while (!Object.class.equals(searchType) && searchType != null) {
            Field[] fields = searchType.getDeclaredFields();
            for (Field field : fields) {
                if ((name == null || name.equals(field.getName())) && (type == null || type.equals(field.getType()))) {
                    return field;
                }
            }
            searchType = searchType.getSuperclass();
        }
        return null;
    }

    public static boolean filedNotNull(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof String && "".equals(((String) o).trim())) {
            return false;
        } else if (o instanceof List && ((List) o).size() == 0) {
            return false;
        }
        return true;
    }

    public static boolean filedNull(Object o) {
        return !filedNotNull(o);
    }
}
