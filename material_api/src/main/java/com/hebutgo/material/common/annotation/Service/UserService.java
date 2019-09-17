package com.hebutgo.material.common.annotation.Service;


import com.hebutgo.material.common.ApiResponse;
import com.hebutgo.material.repository.User;
import com.hebutgo.material.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    UserRepository userRepository;
    public ApiResponse<Integer> register(String userId, String password, String userName, String gender ){
        User user = new User();
        user = userRepository.findByUserIdAndPassword(userId,password);
        if(user != null){
            return ApiResponse.error("用户已存在");
        }
        else{
            try {
                user.setUserId(userId);
                user.setPassword(password);
                user.setGender(gender);
                user.setUserName(userName);
                userRepository.save(user);
            } catch (Exception e){
                e.printStackTrace();
                return ApiResponse.error("注册失败");
            }
            return ApiResponse.success("注册成功");
        }
    }

}
