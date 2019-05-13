package com.dsq.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Spring boot 处理异常方式一，自定义页面
 */

@Controller
public class DemoController {
    @RequestMapping("/show")
    public String showInfo(){
        String str = null;
        str.length();
        return "index";
    }
    @RequestMapping("/show2")
    public String showInfo2(){
        int a = 10/0;
        return "index";
    }

    /**
     * java.lang.ArithmeticException
     * @param e
     * @return
     */
    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("error", e.toString());
        mv.setViewName("error2");
        return mv;
    }
}
