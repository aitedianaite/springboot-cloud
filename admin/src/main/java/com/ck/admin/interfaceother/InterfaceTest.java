package com.ck.admin.interfaceother;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
@FeignClient(name = "userService")
public interface InterfaceTest {

        @RequestMapping(value = "/user/userTest", method = RequestMethod.GET)
        public HashMap<String,Object> userTest();
}
