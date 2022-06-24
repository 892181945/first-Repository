package com.ck.service.imp;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.ck.request.LoginRequest;
import com.ck.response.CommodResponse;
import com.ck.service.LoginService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    private static RedisTemplate redisTemplate;

    @Override
    public String login(LoginRequest loginRequest) {
        StpUtil.login(1);
        SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
        return tokenInfo.getTokenValue();
    }

    {
        redisTemplate.opsForValue().set("concurrency",1);
    }


    @Override
    public String concurrency() {
        int a =  (int)redisTemplate.opsForValue().get("redisTemplate");

        a++;
        System.out.println("修改值为："+a);
        redisTemplate.opsForValue().set("concurrency",a);

        return null;
    }
}
