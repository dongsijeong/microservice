package com.dsq.springbootservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan //在SpringBoot启动时扫描@WebServlet，并将该类实例化
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
