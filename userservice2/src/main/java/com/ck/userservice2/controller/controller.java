package com.ck.userservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
        map.put("爱好","篮球:8082");
        System.out.println(map.toString());
        return map;

    }

}
