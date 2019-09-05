package com.hebutgo.material.repository;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "cert")
@Data
public class Cert {
//    -- 购物车表
//    CREATE TABLE `cert`(
//            `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
//            `cert_id` VARCHAR(255) NOT NULL COMMENT '购物车id',
//            `user_id` VARCHAR(255) NOT NULL COMMENT '用户id',
//            `material_id` VARCHAR(255) NOT NULL COMMENT '素材id',
//            `amount` INT(11) NOT NULL COMMENT '素材数量',
//            `is_delete` VARCHAR(2) NOT NULL DEFAULT '0' COMMENT '是否删除（0未删除，1已删除）',
//            `create_time` BIGINT(20) COMMENT '创建时间（时间戳13位）',
//            `update_time` BIGINT(20) COMMENT '更新时间（时间戳13位）',
//    PRIMARY KEY(`id`),
//    UNIQUE KEY `cert_id`(`cert_id`),
//    KEY `user_id`(`user_id`),
//    KEY `material_id`(`material_id`)
//            )ENGINE=INNODB DEFAULT charset=utf8 COMMENT '购物车表';
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer id;
    public String certId;
    public String userId;
    public String materialId;
    public Integer amount;
    public String isDelete;
    public Long createTime;
    public Long updateTime;
}
