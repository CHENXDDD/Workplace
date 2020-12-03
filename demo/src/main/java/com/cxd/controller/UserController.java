package com.cxd.controller;


import com.cxd.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    private String USERSERVICE_URL = "http://localhost:9001/user";

    @RequestMapping("/login")
    public Map login(String name , String password){
        Map<String,String> params = new HashMap<>();
        params.put("name",name);
        params.put("password",password);


        User
    }

}
