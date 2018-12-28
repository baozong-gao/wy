package com.shenxin.core.smartpropertymanagement.security;

import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @Author: gaobaozong
 * @Description: security 用户实体
 * @Date: Created in 2018/6/4 - 17:09
 * @Version: V1.0
 */

@Data
@ToString
@EqualsAndHashCode(exclude = {"user"})
public class AnyUser extends User {
    private Long id;

    private String nickname;

    private SysUsrDAO user;

    AnyUser(
            String username,
            String password,
            Collection<? extends GrantedAuthority> authorities
    ) {
        super(username, password, authorities);
    }
}
