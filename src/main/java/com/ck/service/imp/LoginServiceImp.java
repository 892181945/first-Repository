package com.ck.service.imp;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.ck.request.LoginRequest;
import com.ck.response.CommodResponse;
import com.ck.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    @Override
    public String login(LoginRequest loginRequest) {
        StpUtil.login(1);
        SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
        return tokenInfo.getTokenValue();
    }
}
