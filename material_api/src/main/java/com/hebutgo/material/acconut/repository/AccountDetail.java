package com.hebutgo.material.repository;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "account_detail")
@Data
public class AccountDetail {
//    -- 账户流水表
//    CREATE TABLE `account_detail` (
//            `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
//            `account_detail_id` VARCHAR(255) NOT NULL COMMENT '账户流水id',
//            `account_id` VARCHAR(255) NOT NULL COMMENT '账户id',
//            `order_id` VARCHAR(255) NOT NULL COMMENT '订单id',
//            `amount` VARCHAR(255) NOT NULL DEFAULT '0'  COMMENT '流水金额',
//            `type` VARCHAR(2) NOT NULL DEFAULT '1' COMMENT '1支出，2收入，3充值',
//            `is_delete` VARCHAR(2) NOT NULL DEFAULT '0' COMMENT '是否删除（0未删除，1已删除）',
//            `create_time` BIGINT(20) COMMENT '创建时间（时间戳13位）',
//            `update_time` BIGINT(20) COMMENT '更新时间（时间戳13位）',
//    PRIMARY KEY (`id`),
//    UNIQUE KEY(`account_detail_id`),
//    KEY `order_id`(`order_id`),
//    KEY `account_id`(`account_id`)
//            )ENGINE = INNODB DEFAULT charset = utf8 COMMENT '账户流水表';
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer id;
    public String accountDetailId;
    public String accountId;
    public String orderId;
    public Integer amount;
    public String type;
    public String isDelete;
    public Long createTime;
    public Long updateTime;
}
