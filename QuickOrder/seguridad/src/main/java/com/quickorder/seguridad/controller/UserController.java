package com.quickorder.seguridad.controller;

import com.quickorder.seguridad.model.User;
import com.quickorder.seguridad.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "inicio")
    public String welcome(){
        return "Welcome from secure endpoint";
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}