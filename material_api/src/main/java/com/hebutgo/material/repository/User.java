package com.hebutgo.material.repository;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    //    -- 用户表
//    CREATE TABLE `user` (
//            `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
//            `user_id` varchar(255) NOT NULL COMMENT '用户id',
//            `password` varchar(255) NOT NULL COMMENT '密码',
//            `user_name` varchar(255) DEFAULT '' COMMENT '用户姓名',
//            `gender` varchar(2) DEFAULT '0' COMMENT '性别（0保密，1男，2女）',
//            `email` varchar(255) DEFAULT '' COMMENT '邮箱',
//            `wechat_id` varchar(255) DEFAULT NULL COMMENT '微信id',
//            `status` varchar(2) DEFAULT NULL COMMENT '用户状态（0有效，1无效）',
//            `create_time` BIGINT(20) COMMENT '创建时间（时间戳13位）',
//            `update_time` BIGINT(20) COMMENT '更新时间（时间戳13位）',
//    PRIMARY KEY (`id`),
//    UNIQUE KEY `user_id` (`user_id`)
//            ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;
    String userId;
    String password;
    String userName;
    String gender;
    String email;
    String wechatId;
    String status;
    Long createTime;
    Long updataTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Long updataTime) {
        this.updataTime = updataTime;
    }
}
