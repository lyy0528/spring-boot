package com.zb.zbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    public static void main(String[] args) {
        // 创建POST请求对象
 /*     HttpPost httpPost = new HttpPost(url);*/
        System.out.println("33344444");
        System.out.println("34544765765");
        System.out.println("33333333333");
        System.out.println("eccecececece");
        System.out.println("545654657657");
        System.out.println("3444444");
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/login33")
    public String login33(){
        return "login33";
    }
}
