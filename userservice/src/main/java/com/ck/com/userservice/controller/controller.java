package com.ck.com.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class controller {

    @GetMapping("/userTest")
    public HashMap<String,Object> userTest(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("姓名","张三");
        map.put("爱好","篮球");
        return map;

    }

}
