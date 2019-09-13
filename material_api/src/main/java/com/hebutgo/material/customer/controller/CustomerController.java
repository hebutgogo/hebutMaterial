package com.hebutgo.material.customer.controller;

import com.hebutgo.material.common.ApiResponse;
import com.hebutgo.material.customer.pojo.UserVO;
import com.hebutgo.material.customer.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Resource
    CustomerService customerService;

    /**
     * 用户注册
     * @param userId        登录id
     * @param password      密码（前端md5）
     * @param userName      姓名（）
     * @param email         邮箱（）
     * @return
     */
    @RequestMapping(value = "register",method = RequestMethod.POST)
    public ApiResponse register(
            @RequestParam(value = "userId") String userId,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "userName",required = false) String userName,
            @RequestParam(value = "email",required = false) String email
    ){
        try {
            customerService.register(userId,password,userName,email);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
        return ApiResponse.success();
    }

    /**
     * 用户登录
     * @param userId        登录id
     * @param password      密码
     * @return  UserVO
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ApiResponse login(
            @RequestParam(value = "userId") String userId,
            @RequestParam(value = "password") String password
    ){
        UserVO userVO = new UserVO();
        try {
            userVO = customerService.login(userId,password);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
        return ApiResponse.success(userVO);
    }
}
