package com.hebutgo.material.repository;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tag")
@Data
public class Tag {
//-- 标签表
//    CREATE TABLE `tag`(
//            `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
//            `tag_id` VARCHAR(255) NOT NULL COMMENT '标签id',
//            `tag_name` VARCHAR(255) NOT NULL COMMENT '标签名称',
//            `desc` VARCHAR(255) NOT NULL COMMENT '标签说明',
//            `is_delete` VARCHAR(2) NOT NULL DEFAULT '0' COMMENT '是否删除（0未删除，1已删除）',
//            `create_time` BIGINT(20) COMMENT '创建时间（时间戳13位）',
//            `update_time` BIGINT(20) COMMENT '更新时间（时间戳13位）',
//    PRIMARY KEY(`id`),
//    UNIQUE KEY `tag_id`(`tag_id`),
//    UNIQUE KEY `tag_name`(`tag_name`)
//            )ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标签表';
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer id;
    public String tagId;
    public String tagName;
    public String desc;
    public String isDelete;
    public Long createTime;
    public Long updateTime;
}
