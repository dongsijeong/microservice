package com.dsq.springbootvalidate.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @NotBlank: 判断字符串是否为null或者空串（去掉收尾空格）
 * @NotEmpty: 判断字符串是否为null或者空串（不会去掉收尾空格）
 * @Length: 判断字符的长度（做大或者最小）
 * @Min: 判断数值最小
 * @Max: 判断数值最大
 * @Email: 判断邮箱是否合法
 */
public class Users {
    @NotBlank(message = "用户名不能为空！") //非空校验
    private String name;
    @NotBlank //非空校验
    private String password;
    @Min(value = 19)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
