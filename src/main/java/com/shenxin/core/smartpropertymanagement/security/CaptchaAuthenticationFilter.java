package com.shenxin.core.smartpropertymanagement.security;

import com.shenxin.core.smartpropertymanagement.controller.CaptchaImageCreateController;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

/**
 * @Author: gaobaozong
 * @Description: 验证码 验证器
 * @Date: Created in 2018/6/5 - 15:40
 * @Version: V1.0
 */
public class CaptchaAuthenticationFilter extends AbstractAuthenticationProcessingFilter {

    private String processUrl;

    private static final String CAPTCHA_KEY = CaptchaImageCreateController.CAPTCHA_KEY;

    public CaptchaAuthenticationFilter(String defaultFilterProcessesUrl, String failureUrl) {
        super(defaultFilterProcessesUrl);
        this.processUrl = defaultFilterProcessesUrl;
        setAuthenticationFailureHandler(new SimpleUrlAuthenticationFailureHandler(failureUrl));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res=(HttpServletResponse)response;
        if(processUrl.equals(req.getServletPath()) && "POST".equalsIgnoreCase(req.getMethod())){
            String expect = Optional.ofNullable(req.getSession().getAttribute(CAPTCHA_KEY)).map(String::valueOf).orElse(null);

            //销毁验证码
            req.getSession().removeAttribute(CAPTCHA_KEY);

            if (expect != null && !expect.equals(req.getParameter("code").toLowerCase())){
                unsuccessfulAuthentication(req, res, new InsufficientAuthenticationException("验证码错误"));
                return;
            }
        }
        chain.doFilter(request, response);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws AuthenticationException, IOException, ServletException {
        return null;
    }
}
