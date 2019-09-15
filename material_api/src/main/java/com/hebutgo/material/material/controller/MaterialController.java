package com.hebutgo.material.material.controller;

import com.hebutgo.material.common.ApiResponse;
import com.hebutgo.material.common.annotation.AccessToken;
import com.hebutgo.material.common.annotation.IgnoreAccessToken;
import com.hebutgo.material.material.pojo.MaterialVO;
import com.hebutgo.material.material.repository.Material;
import com.hebutgo.material.material.service.MaterialService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("material")
@AccessToken
public class MaterialController {

    @Resource
    MaterialService materialService;

    @RequestMapping(value = "getMaterialList", method = RequestMethod.POST)
    public ApiResponse getMaterialList(

    ){
        List<MaterialVO> materialList = new ArrayList<>();
        try {
             materialList = materialService.getMaterialList();
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error(e.getMessage());
        }
        return ApiResponse.success(materialList);
    }
}
