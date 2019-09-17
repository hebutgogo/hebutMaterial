package com.hebutgo.material.common.Controllor;

import com.hebutgo.material.common.ApiResponse;
import com.hebutgo.material.common.annotation.AccessToken;
import com.hebutgo.material.common.annotation.IgnoreAccessToken;
import com.hebutgo.material.common.annotation.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@AccessToken
public class CustomterControllor {
    @Resource
    UserService userService;

    @IgnoreAccessToken
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public ApiResponse register(
            @RequestParam(value = "userId") String userId,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "gender") String gender
    ) {
        try {
            userService.register(userId, password, userName, gender);
        } catch (Exception e) {
            return ApiResponse.error("注册失败");
        }
        return ApiResponse.success("注册成功");
    }
}


   /* @RequestMapping(value = "register", method = RequestMethod.GET)
    public ApiResponse login(
            @RequestParam(value = "userId") String userId,
            @RequestParam(value = "password") String password
    ) {
        try {
            userService.register(userId, password);
        } catch (Exception e){
            return ApiResponse.error("注册失败");
        }
        return ApiResponse.success("注册成功");
    }
}*/
