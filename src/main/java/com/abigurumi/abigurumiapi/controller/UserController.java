package com.abigurumi.abigurumiapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.abigurumi.abigurumiapi.entity.UserEntity;
import com.abigurumi.abigurumiapi.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserEntity user) {
        if (userRepository.findByCelular(user.getCelular()) != null) {
            return ResponseEntity.badRequest().body("Celular já cadastrado");
        }
        userRepository.save(user);
        return ResponseEntity.ok("Usuário cadastrado com sucesso");
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserEntity user) {
        UserEntity existingUser = userRepository.findByCelular(user.getCelular());
        if (existingUser != null && existingUser.getSenha().equals(user.getSenha())) {
            return ResponseEntity.ok("Login bem-sucedido");
        }
        return ResponseEntity.status(401).body("Celular ou senha inválidos");
    }
}