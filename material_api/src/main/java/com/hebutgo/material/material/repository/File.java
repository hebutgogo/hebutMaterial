package com.hebutgo.material.material.repository;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "file")
@Data
public class File {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String fileId;
    private String filePath;
    private String fileName;
    private String fileDesc;
    private String isDelete;
    private Long createTime;
    private Long updateTime;

}
