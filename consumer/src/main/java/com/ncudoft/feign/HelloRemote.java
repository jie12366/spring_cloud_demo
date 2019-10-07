package com.ncudoft.feign;

import com.ncudoft.fallback.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author www.xyjz123.xyz
 * @description
 * @date 2019/10/7 10:25
 */
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    /**
     * 测试feign远程服务调用
     * @param name 参数
     * @return String
     */
    @RequestMapping("/hello")
    String hello(@RequestParam("name")String name);
}