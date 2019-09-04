package com.hebutgo.material.repository;

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
    Integer id;
    String orderId;
    String userId;
    String payAmount;
    String status;
    String isDelete;
    Long createTime;
    Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
