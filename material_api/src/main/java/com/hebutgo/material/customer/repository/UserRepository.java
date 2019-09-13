package com.hebutgo.material.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserId(String userId);

    User findByUserIdAndPassword(String userId, String password);

    User findByToken(String token);
}
