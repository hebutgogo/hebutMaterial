package com.hebutgo.material.material.repository;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tag")
@Data
public class Tag {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String tagId;
    private String tagName;
    private String desc;
    private String isDelete;
    private Long createTime;
    private Long updateTime;
}
