package com.shenxin.core.smartpropertymanagement.config;

import com.shenxin.core.smartpropertymanagement.security.CaptchaAuthenticationFilter;
import com.shenxin.core.smartpropertymanagement.security.FilterSecurityInterceptor;
import com.shenxin.core.smartpropertymanagement.util.EncryptUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: gaobaozong
 * @Description: 安全中心配置
 * @Date: Created in 2018/6/4 - 16:59
 * @Version: V1.0
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    @Qualifier("myInterceptor")
    FilterSecurityInterceptor interceptor;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new PasswordEncoder(){
            @Override
            public String encode(CharSequence charSequence) {
                return EncryptUtils.encryptPwd(charSequence.toString());
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                return s.equals(EncryptUtils.encryptPwd((String)charSequence));
            }
        };
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore(new CaptchaAuthenticationFilter("/login","/login?error=true"), UsernamePasswordAuthenticationFilter.class);
        http.addFilterBefore(interceptor, org.springframework.security.web.access.intercept.FilterSecurityInterceptor.class);
        http
                .authorizeRequests()
                .antMatchers("/css/**","/js/**","/img/**","/lib/**","/image/captcha-image","/xls_template/**","/browersError").permitAll()
                .anyRequest().authenticated()
            .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/index", true)
                .failureUrl("/login?error=true")
                .permitAll()
            .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
                .permitAll()
            .and()
                .rememberMe()
                .tokenValiditySeconds(60*60*5)
                .key("aa")     //cookie私钥
            .and()
                .headers().frameOptions().disable()
            .and()
                .csrf().disable();
        http.sessionManagement().maximumSessions(1).expiredUrl("/login");
        http.exceptionHandling().authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/login"){
            @Override
            public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
                if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
                    //对于ajax请求不重定向  而是返回错误代码
                    response.sendError(HttpServletResponse.SC_FORBIDDEN, "请登入");
                } else {
                    super.commence(request, response, authException);
                }
            }
        });
    }

}