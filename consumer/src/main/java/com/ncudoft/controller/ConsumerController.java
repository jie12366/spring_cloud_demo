package com.ncudoft.controller;

import com.ncudoft.feign.HelloRemote;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author www.xyjz123.xyz
 * @description
 * @date 2019/10/7 10:30
 */
@RestController
public class ConsumerController {

    @Resource
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name")String name){
        return helloRemote.hello(name);
    }
}