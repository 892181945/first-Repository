package com.ck.service.imp;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.ck.request.LoginRequest;
import com.ck.response.CommodResponse;
import com.ck.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    private  RedisTemplate redisTemplate;

    private Lock lock = new ReentrantLock();

    @Override
    public String login(LoginRequest loginRequest) {
        StpUtil.login(1);
        SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
        return tokenInfo.getTokenValue();
    }

//    {
//        redisTemplate.opsForValue().set("concurrency",1);
//    }


    @Override
    public String concurrency() {
        int temp;

        try {
            lock.lock();
            String redisValue = (String) redisTemplate.opsForValue().get("concurrency");
            temp = Integer.valueOf(redisValue);
            temp++;
            System.out.println(Thread.currentThread().getName()+"获取锁");
            System.out.println("修改值为："+temp);
            redisTemplate.opsForValue().set("concurrency", Integer.valueOf(temp).toString());
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName()+"释放锁锁");
        }





        return null;
    }
}
