package com.hebutgo.material.account.repository;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Data
public class Account {
//-- 账户表
//    CREATE TABLE `account`(
//            `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
//            `account_id` VARCHAR(255) NOT NULL COMMENT '账户id',
//            `user_id` VARCHAR(255) NOT NULL COMMENT '用户id',
//            `account_amount` INT(255) NOT NULL COMMENT '账户余额',
//            `is_delete` VARCHAR(2) NOT NULL DEFAULT '0' COMMENT '是否删除（0未删除，1已删除）',
//            `create_time` BIGINT(20) COMMENT '创建时间（时间戳13位）',
//            `update_time` BIGINT(20) COMMENT '更新时间（时间戳13位）',
//    PRIMARY KEY (`id`),
//    UNIQUE KEY(`account_id`),
//    KEY `user_id`(`user_id`)
//            )ENGINE = INNODB DEFAULT charset = utf8 COMMENT '账户表';
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer id;
    public String accountId;
    public String userId;
    public Integer accountAmount;
    public String isDelete;
    public Long createTime;
    public Long updateTime;
}
