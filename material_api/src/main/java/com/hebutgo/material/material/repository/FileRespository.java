package com.hebutgo.material.material.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRespository extends JpaRepository<File,Integer> {
    File findByFileId(String fileId);

    List<File> findAllByFileId(List<String> showFileIdsList);
}
