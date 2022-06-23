package com.ck.request;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginRequest {

    @NotBlank(message = "账号不可为空")
    private String userNane;

    @NotBlank(message = "密码不可为空")
    private String password;


}
