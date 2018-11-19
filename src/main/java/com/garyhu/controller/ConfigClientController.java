package com.garyhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Administrator
 * @decripetion :
 * @since : 2018/11/19
 **/
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${form}")
    private String form;

    @Autowired
    private Environment env;

    @GetMapping("/profile")
    public String getForm(){
        return this.form;
    }

    /**
     * 通过Environment来获取属性值
     * @return
     */
    @GetMapping("/form")
    public String form(){
        return env.getProperty("form","undefined");
    }
}
