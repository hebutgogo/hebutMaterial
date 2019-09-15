package com.hebutgo.material.customer.controller;

import com.hebutgo.material.common.ApiResponse;
import com.hebutgo.material.customer.pojo.UserVO;
import com.hebutgo.material.customer.repository.User;
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

    /**
     * 用户信息的显示
     * @param token        token
     * @return       User
     */
    @RequestMapping(value = "infoDetail",method = RequestMethod.POST)
    public ApiResponse infoDetail(
            @RequestParam(value = "token") String token
    ){
        User user = customerService.infoDetail(token);
        return ApiResponse.success(user);
    }

    /**
     * 修改用户信息
     * @param token
     * @param newUserName
     * @param newEmail
     * @param newWechatId
     * @return User
     */
    @RequestMapping(value = "changeInfo",method = RequestMethod.POST)
    public ApiResponse changeInfo(
            @RequestParam(value = "token") String token,
            @RequestParam(value = "newUserName") String newUserName,
            @RequestParam(value = "newEmail") String newEmail,
            @RequestParam(value = "newWechatId") String newWechatId
    ){
        User user = new User();
        user = customerService.changeInfo(token,newUserName,newEmail,newWechatId);
        return ApiResponse.success(user);
    }

    /**
     * 修改密码
     * @param newPassword
     * @param token
     * @return  user
     */
    @RequestMapping(value = "changePassword",method = RequestMethod.POST)
    public ApiResponse changePassword(
            @RequestParam(value = "newPassword") String newPassword,
            @RequestParam(value = "token") String token
    ){
       User user = new User();
       user = customerService.changePassword(newPassword,token);
       return ApiResponse.success(user);
    }
}
