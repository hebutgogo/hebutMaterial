package com.hebutgo.material.order.repository;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "order")
@Data
public class Order {
//    -- 订单表
//    CREATE TABLE `order` (
//            `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
//            `order_id` VARCHAR(255) NOT NULL COMMENT '订单id',
//            `user_id` VARCHAR(255) NOT NULL COMMENT '用户id',
//            `pay_amount` VARCHAR(255) NOT NULL COMMENT '订单价格(单位：but币)',
//            `status` VARCHAR(10) NOT NULL COMMENT '订单状态（0未支付，1已支付，2支付失败，3订单取消）',
//            `is_delete` VARCHAR(2) NOT NULL DEFAULT '0' COMMENT '是否删除（0未删除，1已删除）',
//            `create_time` BIGINT(20) COMMENT '创建时间（时间戳13位）',
//            `update_time` BIGINT(20) COMMENT '更新时间（时间戳13位）',
//    PRIMARY KEY (`id`),
//    UNIQUE KEY `order_id` (`order_id`),
//    KEY `user_id` (`user_id`)
//            )ENGINE = INNODB DEFAULT charset = utf8 COMMENT '订单表';
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer id;
    public String orderId;
    public String userId;
    public String payAmount;
    public String status;
    public String isDelete;
    public Long createTime;
    public Long updateTime;
}
