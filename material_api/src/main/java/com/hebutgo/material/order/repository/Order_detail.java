package com.hebutgo.material.order.repository;

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
    public Integer id;
    public String orderDetialId;
    public String orderId;
    public String materialId;
    public Integer materialAmount;
    public Integer materialPrice;
    public String settlePrice;
    public String isDelete;
    public Long createTime;
    public Long updateTime;
}
