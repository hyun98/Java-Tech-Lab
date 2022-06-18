package com.spring.springsecuritybasic.controller;

import com.spring.springsecuritybasic.controller.AuthApiImpl.UserSignInDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
public interface AuthApi {

    @GetMapping("/test")
    ResponseEntity getTestV1();

    @PostMapping("/auth/login")
    ResponseEntity loginV1();

    @PostMapping("/auth/logout")
    ResponseEntity logoutV1();

    @PostMapping("/signin")
    ResponseEntity signInV1(@RequestBody UserSignInDto userSignInDto);
}