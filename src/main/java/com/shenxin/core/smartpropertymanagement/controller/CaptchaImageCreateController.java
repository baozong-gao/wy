package com.shenxin.core.smartpropertymanagement.controller;

import com.google.code.kaptcha.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;

@Slf4j
@Controller
public class CaptchaImageCreateController {


    private Producer captchaProducer = null;

    public static final String CAPTCHA_KEY = "captcha_key";

    @Autowired
    public void setCaptchaProducer(Producer captchaProducer) {
        this.captchaProducer = captchaProducer;
    }

    @RequestMapping(value = {"/image/captcha-image"})
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try (ServletOutputStream out = response.getOutputStream()) {
            response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
            response.addHeader("Cache-Control", "post-check=0, pre-check=0");
            response.setHeader("Pragma", "no-cache");
            response.setContentType("image/jpeg");

            String capText = captchaProducer.createText();
            HttpSession session = request.getSession(true);
            session.setAttribute(CAPTCHA_KEY, capText);
            BufferedImage bi = captchaProducer.createImage(capText);

            ImageIO.write(bi, "jpg", out);
            out.flush();
            log.debug("session:【{}】,验证码：【{}】", request.getSession().getId(), capText);
        } catch (Exception e) {
            log.error("生成验证码异常", e);
        }
        return null;
    }
}
