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
    public Integer id;
    public String userId;
    public String password;
    public String userName;
    public String gender;
    public String email;
    public String wechatId;
    public String status;
    public Long createTime;
    public Long updataTime;
    public String token;
}
