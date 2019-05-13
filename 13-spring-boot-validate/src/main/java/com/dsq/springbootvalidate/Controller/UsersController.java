package com.dsq.springbootvalidate.Controller;

import com.dsq.springbootvalidate.domain.Users;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * springboot 表单数据验证
 */
@Controller
public class UsersController {

    /**
     * 解决异常的方式。可以在跳转页面的方法注入一个User对象
     * 注意：由于springmvc会将该对象放入到Model中传递。
     * key的名称会使用该对象的驼峰式命名规则来作为key
     * 参数的变量名需要与对象名称相同。想首字母小写
     * @param users
     * @return
     */
    @RequestMapping("/addUser")
    public String showPage(Users users){

        return "add";
    }

    /**
     *完成用户添加
     *@Valid 表示开启对Users对象的数据校验
     * BindingResult 封装了校验的结果
     * @param users
     * @return
     */
    @RequestMapping("/save")
    public String saveUser(@Valid Users users, BindingResult result){
        if(result.hasErrors()){
            return "add";
        }
        return "success";
    }
}
