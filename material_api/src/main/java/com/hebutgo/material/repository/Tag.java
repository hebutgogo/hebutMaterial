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
    Integer id;
    String tagId;
    String tagName;
    String desc;
    String isDelete;
    Long createTime;
    Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
