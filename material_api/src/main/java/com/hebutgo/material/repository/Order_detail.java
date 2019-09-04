package com.hebutgo.material.repository;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "order_detial")
@Data
public class Order_detail {
//    -- 订单详情表
//    CREATE TABLE `order_detail` (
//            `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
//            `order_detail_id` VARCHAR(255) NOT NULL COMMENT '订单详情id',
//            `order_id` VARCHAR(255) NOT NULL COMMENT '订单id',
//            `material_id` VARCHAR(255) NOT NULL COMMENT '素材id',
//            `material_amount` INT(11) NOT NULL COMMENT '素材数量',
//            `material_price` INT(11) NOT NULL COMMENT '成交单价（but币，无小数）',
//            `settle_price` VARCHAR(255) NOT NULL DEFAULT '0' COMMENT '成交价格',
//            `is_delete` VARCHAR(2) NOT NULL DEFAULT '0' COMMENT '是否删除（0未删除，1已删除）',
//            `create_time` BIGINT(20) COMMENT '创建时间（时间戳13位）',
//            `update_time` BIGINT(20) COMMENT '更新时间（时间戳13位）',
//    PRIMARY KEY (`id`),
//    UNIQUE KEY(`order_detail_id`),
//    KEY `order_id`(`order_id`),
//    KEY `material_id`(`material_id`)
//            )ENGINE = INNODB DEFAULT charset = utf8 COMMENT '订单详情表';
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;
    String orderDetialId;
    String orderId;
    String materialId;
    Integer materialAmount;
    Integer materialPrice;
    String settlePrice;
    String isDelete;
    Long createTime;
    Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderDetialId() {
        return orderDetialId;
    }

    public void setOrderDetialId(String orderDetialId) {
        this.orderDetialId = orderDetialId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public Integer getMaterialAmount() {
        return materialAmount;
    }

    public void setMaterialAmount(Integer materialAmount) {
        this.materialAmount = materialAmount;
    }

    public Integer getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(Integer materialPrice) {
        this.materialPrice = materialPrice;
    }

    public String getSettlePrice() {
        return settlePrice;
    }

    public void setSettlePrice(String settlePrice) {
        this.settlePrice = settlePrice;
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
