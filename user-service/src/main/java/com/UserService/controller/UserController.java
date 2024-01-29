package com.UserService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user-service")
public class UserController {

   @GetMapping("/getUser/{userId}")
    public ResponseEntity<String> getUser(@PathVariable String userId) {
        System.out.println("************");
        return null;
    }

}
