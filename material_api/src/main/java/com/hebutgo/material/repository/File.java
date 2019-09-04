package com.hebutgo.material.repository;

import lombok.Data;
import org.omg.PortableInterceptor.INACTIVE;

import javax.persistence.*;

@Entity
@Table(name = "file")
@Data
public class File {
//    -- 文件表
//    CREATE TABLE `file`(
//            `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
//            `file_id` VARCHAR(255) NOT NULL COMMENT '文件id',
//            `file_path` VARCHAR(255) NOT NULL COMMENT '文件相对路径',
//            `file_name` VARCHAR(255) NOT NULL COMMENT '文件名称',
//            `file_desc` VARCHAR(255) NOT NULL COMMENT '文件描述',
//            `is_delete` VARCHAR(2) NOT NULL DEFAULT '0' COMMENT '是否删除（0未删除，1已删除）',
//            `create_time` BIGINT(20) COMMENT '创建时间（时间戳13位）',
//            `update_time` BIGINT(20) COMMENT '更新时间（时间戳13位）',
//    PRIMARY KEY (`id`),
//    UNIQUE KEY(`file_id`)
//)ENGINE = INNODB DEFAULT charset = utf8 COMMENT '文件表';
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;
    String fileId;
    String filePath;
    String fileName;
    String fileDesc;
    String isDelete;
    Long createTime;
    Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDesc() {
        return fileDesc;
    }

    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
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
