package com.abigurumi.abigurumiapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abigurumi.abigurumiapi.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserEntity findByCelular(String celular);
}