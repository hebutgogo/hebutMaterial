package com.hebutgo.material.material.repository;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "material")
@Data
public class Material {
//    -- 素材表
//    CREATE TABLE `material`(
//            `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
//            `material_id` VARCHAR(255) NOT NULL COMMENT '素材id',
//            `tag_ids` VARCHAR(255) COMMENT '素材标签（逗号分隔）',
//            `material_name` VARCHAR(255) NOT NULL COMMENT '素材名称',
//            `material_desc` VARCHAR(1000) COMMENT '素材描述',
//            `file_id` VARCHAR(255) COMMENT '素材文件id',
//            `show_file_ids` VARCHAR(1000) COMMENT '展示图片文件id（逗号分隔）',
//            `price` INT(11) NOT NULL DEFAULT 0 COMMENT '素材单价，单位为but币，无小数',
//            `status` VARCHAR(2) NOT NULL DEFAULT '0' COMMENT '素材状态（0默认，1有效，2无效）',
//            `is_delete` VARCHAR(2) NOT NULL DEFAULT '0' COMMENT '是否删除（0未删除，1已删除）',
//            `create_time` BIGINT(20) COMMENT '创建时间（时间戳13位）',
//            `update_time` BIGINT(20) COMMENT '更新时间（时间戳13位）',
//    PRIMARY KEY (`id`),
//    UNIQUE KEY `material_id` (`material_id`),
//    KEY `material_name` (`material_name`)
//            )ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='素材表';
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer id;
    public String materialId;
    public String tagIds;
    public String materialName;
    public String materialDesc;
    public String fileId;
    public String showFileIds;
    public Integer price;
    public String status;
    public String isDelete;
    public Long createTime;
    public Long updateTime;
}
