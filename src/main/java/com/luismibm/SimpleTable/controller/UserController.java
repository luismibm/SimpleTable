package com.luismibm.SimpleTable.controller;

import com.luismibm.SimpleTable.model.dto.UserRegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/users")
public class UserController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserDetailsManager userDetailsManager;

    @PostMapping("/register/")
    public String register(@RequestBody UserRegisterRequest userRegisterRequest) {
        if (userDetailsManager.userExists(userRegisterRequest.getUsername())){
            return "ERROR: user already exists";
        }
        userDetailsManager.createUser(User.builder()
                .username(userRegisterRequest.getUsername())
                .password(passwordEncoder.encode(userRegisterRequest.getPassword()))
                .roles("USER")
                .build()
        );
        return "OK";
    }

}