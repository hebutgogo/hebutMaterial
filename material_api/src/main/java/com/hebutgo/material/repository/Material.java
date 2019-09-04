package com.hebutgo.material.repository;

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
    Integer id;
    String materialId;
    String tagIds;
    String materialName;
    String materialDesc;
    String fileId;
    String showFileIds;
    Integer price;
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

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialDesc() {
        return materialDesc;
    }

    public void setMaterialDesc(String materialDesc) {
        this.materialDesc = materialDesc;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getShowFileIds() {
        return showFileIds;
    }

    public void setShowFileIds(String showFileIds) {
        this.showFileIds = showFileIds;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
