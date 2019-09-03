package com.hebutgo.material.material.repository;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "material")
@Data
public class Material {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String materialId;
    private String tagIds;
    private String materialName;
    private String materialDesc;
    private String fileId;
    private String showFileIds;
    private Integer price;
    private String status;
    private Integer isDelete;
    private Long createTime;
    private Long updateTime;

}

