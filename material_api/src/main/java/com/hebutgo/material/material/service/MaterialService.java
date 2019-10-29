package com.hebutgo.material.material.service;

import com.hebutgo.material.material.pojo.FileVO;
import com.hebutgo.material.material.pojo.MaterialVO;
import com.hebutgo.material.material.repository.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialService {

    @Resource
    MaterialRepository materialRepository;

    @Resource
    TagRepository tagRepository;

    @Resource
    FileRespository fileRespository;

    public List<MaterialVO> getMaterialList() {
        List<MaterialVO> materialVOs = new ArrayList<>();
        List<Material> materials = materialRepository.findAll();
        if (materials != null) {
            for (Material material:materials
                 ) {
                File file = fileRespository.findByFileId(material.getFileId());

                String[] showFileIdsArray = material.getShowFileIds().split(",");
                List<String> showFileIdsList = new ArrayList<>();
                for (int i = 0; i < showFileIdsArray.length; i ++) {
                    showFileIdsList.add(showFileIdsArray[i]);
                }

                List<FileVO> fileVOS = new ArrayList<>();
                List<File> showFiles = fileRespository.findByFileIdIn(showFileIdsList);
                for (File file1:showFiles
                     ) {
                    FileVO fileVO = new FileVO();
                    fileVO.setFileId(file1.getFileId());
                    fileVO.setFilePath(file1.getFilePath());
                    fileVO.setFileName(file1.getFileName());
                    fileVO.setFileDesc(file1.getFileDesc());
                    fileVOS.add(fileVO);
                }

                MaterialVO materialVO = new MaterialVO();
                materialVO.setMaterialId(material.getMaterialId());
                materialVO.setMaterialName(material.getMaterialName());
                materialVO.setMaterialDesc(material.getMaterialDesc());
                materialVO.setPrice(material.getPrice());
                materialVO.setMaterialUrl(file.getFilePath());
                materialVO.setShowPicUrls(fileVOS);

                materialVOs.add(materialVO);
            }
        }
        return materialVOs;
    }
}
