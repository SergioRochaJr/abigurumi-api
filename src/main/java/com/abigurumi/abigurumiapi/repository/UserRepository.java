package com.abigurumi.abigurumiapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abigurumi.abigurumiapi.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> { // Alterei de Long para String
    UserEntity findByCelular(String celular);
}