package com.ncudoft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author www.xyjz123.xyz
 * @description
 * @date 2019/10/7 15:16
 */
@RestController
public class ConfigController {

    @Value("${neo.hello}")
    private String name;

    @RequestMapping("/config")
    public String testConfig(){
        return this.name;
    }
}