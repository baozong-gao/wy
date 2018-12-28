package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyRoomRL;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author: gaobaozong
 * @Description: 关联 查询
 * @Date: Created in 2018/8/6 - 10:57
 * @Version: V1.0
 */
public interface UnionQueryMapper {

    @Select("<script>select contract_room.contract_id,room.ROOM,comp.COMPANY_NAME,property.property_name,building.building_name from ROOM_INFO room \n" +
            "inner join CONTRACT_ROOM_INFO contract_room on contract_room.contract_id in " +
            "<foreach collection=\"contractIds\" index = \"index\" item = \"id\" open= \"(\" separator=\",\" close=\")\">" +
            "'${id}'" +
            "</foreach>" +
            " and contract_room.ROOM_ID = room.id\n" +
            "INNER join GL_COMPANY comp on room.COMPANY_ID = comp.id\n" +
            "inner join PROPERTY_INFO property on property.id = room.PROPERTY_ID\n" +
            "inner join BUILDING_INFO building on building.id = room.BUILDING_ID</script>")
    @Results({
            @Result(column = "ROOM", property = "roomName"),
            @Result(column = "contract_id", property = "contractId"),
            @Result(column = "COMPANY_NAME", property = "companyName"),
            @Result(column = "property_name", property = "propertyName"),
            @Result(column = "building_name", property = "buildingName")
    })
    List<CompanyRoomRL> getCompanyRoomByContractIds(@Param("contractIds") Object[] contractIds);

    @Select("select * from CONTRACT_TEMPLATE where COMPANY_ID=#{contractId}")
    List<Map<String,Object>> getContractTemp(String contractId);
}
