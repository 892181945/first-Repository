package com.ck.controller;

import com.ck.request.LoginRequest;
import com.ck.response.CommodResponse;
import com.ck.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping(value = "/loginController/")
@RestController
public class loginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping(value = "login",method = RequestMethod.POST)
    public CommodResponse login(@Valid @RequestBody LoginRequest loginRequest){
        if(true) throw new NullPointerException();
        String login = loginService.login(loginRequest);
        return CommodResponse.success(login);
    }

    /**
     * 并发测试
     * @return
     */
    @RequestMapping(value = "concurrency",method = RequestMethod.POST)
    public CommodResponse concurrency(){


        return CommodResponse.success();
    }
}
