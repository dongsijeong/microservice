package com.dsq.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class GlobalException {
    /**
     * 该方法必须要有返回值。返回值类型必须是: SimpleMappingExceptionResolver
     * @return
     */
    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();

        Properties mappings = new Properties();
        //第一个参数表示异常的类型，一定要给定异常类型的全名
        //第二个参数表示异常发生后要跳转的视图名称
        //缺点： 无法传递Exception e 信息
        mappings.put("java.lang.NullPointerException", "error");
        mappings.put("java.lang.ArithmeticException", "error");

        resolver.setExceptionMappings(mappings);
        return  resolver;
    }
}
