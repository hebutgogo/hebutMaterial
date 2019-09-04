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
    Integer id;
    String accountDetailId;
    String accountId;
    String orderId;
    Integer amount;
    String type;
    String isDelete;
    Long createTime;
    Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountDetailId() {
        return accountDetailId;
    }

    public void setAccountDetailId(String accountDetailId) {
        this.accountDetailId = accountDetailId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
