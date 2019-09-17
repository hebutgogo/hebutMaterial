package com.hebutgo.material.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface   UserRepository    extends JpaRepository<User,Integer> {
    User findByUserIdAndPassword(String userId,String password);
}
