package com.hebutgo.material.material.pojo;

import lombok.Data;

import java.util.List;

@Data
public class MaterialVO {
    /**
     * 素材id
     */
    private String materialId;

    private String materialName;

    private String materialDesc;

    private Integer price;

    private String status;

    private Long createTime;

    private List<TagVO> tagVOS;

    private String materialUrl;

    private List<FileVO> showPicUrls;

}
