package com.ck.service;

import com.ck.request.LoginRequest;
import com.ck.response.CommodResponse;
import org.springframework.stereotype.Service;


public interface LoginService {

    public String login (LoginRequest loginRequest);


    public String concurrency ();

}
