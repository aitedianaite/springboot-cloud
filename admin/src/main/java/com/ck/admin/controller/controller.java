package com.ck.admin.controller;

import com.ck.admin.interfaceother.InterfaceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/admin")
public class controller {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private InterfaceTest interfaceTest;

    @GetMapping("/selectUser")
    public HashMap<String,Object> userTest(){
        //根据ID获取服务实力
        List<ServiceInstance> instances = discoveryClient.getInstances("userservice");
        //获取实例ip与端口
        ServiceInstance instance = instances.get(0);
       String url="http://"+instance.getHost()+":"+instance.getPort()+"/user/userTest";
        HashMap<String, Object> map = (HashMap<String, Object>) restTemplate.getForObject(url, Map.class);
        return map;
    }

    @GetMapping("/selectUserOther")
    public HashMap<String,Object> userTestOther(){
        HashMap<String, Object> interfaceTest1 = interfaceTest.userTest();
        return interfaceTest1;
    }





}
