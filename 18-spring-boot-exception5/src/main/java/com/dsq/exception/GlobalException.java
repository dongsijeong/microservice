package com.dsq.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

@Configuration
public class GlobalException implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        //判断不同异常类型，做不同视图跳转
        if (e instanceof ArithmeticException){
            mv.setViewName("error");
        }
        if(e instanceof NullPointerException){
            mv.setViewName("error");
        }
        mv.addObject("error", e.toString());
        return mv;
    }
}
