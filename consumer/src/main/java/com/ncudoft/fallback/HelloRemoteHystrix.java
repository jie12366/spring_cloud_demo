package com.ncudoft.fallback;

import com.ncudoft.feign.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author www.xyjz123.xyz
 * @description
 * @date 2019/10/7 10:59
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello" + name + ", this message send failed";
    }
}