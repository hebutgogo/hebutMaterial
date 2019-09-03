package com.hebutgo.material.customer.service;

import com.hebutgo.material.customer.pojo.UserVO;
import com.hebutgo.material.customer.repository.User;
import com.hebutgo.material.customer.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

@Service
public class CustomerService {

    @Resource
    UserRepository userRepository;

    /**
     * 用户注册
     * @param userId        登录id
     * @param password      密码（md5）
     * @param userName      姓名（可能为null）
     * @param email         邮箱（可能为null）
     */
    public void register(String userId, String password, String userName, String email) throws Exception {

        // 检查用户id是否重复
        if (checkUserIdIsExist(userId)) {
            throw new Exception("用户已存在");
        }

        try {
            User user = new User();
            user.setUserId(userId);
            user.setPassword(password);
            user.setUserName(userName);
            user.setEmail(email);
            user.setGender("0");
            user.setCreateTime(System.currentTimeMillis());
            user.setWechatId("");
            userRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("注册失败");
        }
    }

    /**
     * 检查用户是否存在
     * @param userId    用户id
     * @return  存在返回true
     */
    public boolean checkUserIdIsExist(String userId){
        User user = userRepository.findByUserId(userId);
        if (user == null) {
            return false;
        }
        return true;
    }

    /**
     * 用户登录
     * @param userId        登录id
     * @param password      密码
     * @return  UserVO
     * @throws Exception
     */
    public UserVO login(String userId, String password) throws Exception {
        User user = userRepository.findByUserIdAndPassword(userId,password);
        String token = "";
        // 更新用户token
        if (user != null) {
            token = DigestUtils.md5DigestAsHex((userId+System.currentTimeMillis()).getBytes());
            user.setToken(token);
            userRepository.save(user);
        } else {
            throw new Exception("账号/密码错误");
        }
        UserVO userVO = new UserVO();
        userVO.setToken(token);
        userVO.setUserName(user.getUserName());
        userVO.setGender(user.getGender());
        return userVO;
    }
}
