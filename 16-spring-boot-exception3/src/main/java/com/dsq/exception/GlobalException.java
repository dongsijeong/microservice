package com.dsq.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {
    /**
     * java.lang.ArithmeticException,java.lang.NullPointerException
     * 该方法需要返回一个ModelAndView: 目的是可以让我们封装异常信息以及视图的指定
     * 参数Exception e：会将产生异常对象注入到方法中
     * @param e
     * @return
     */
    @ExceptionHandler(value = {java.lang.ArithmeticException.class, java.lang.NullPointerException.class})
    public ModelAndView showException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("error", e.toString());
        mv.setViewName("error");
        return mv;
    }
}
