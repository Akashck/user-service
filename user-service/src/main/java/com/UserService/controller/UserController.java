package com.UserService.controller;

import com.UserService.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user-service")
public class UserController {

    @Autowired
    com.UserService.service.Users users;

    @GetMapping("/getUser/{userId}")
    public ResponseEntity<List<UserModel>> getUser(@PathVariable String userId) {
        return new ResponseEntity<>(users.getUser(), HttpStatus.OK);
    }

    @PostMapping("/createUSer")
    public ResponseEntity<String> createUSer(@RequestBody List<UserModel> user) {
        users.updateUser(user);
        return new ResponseEntity<>("user is Created", HttpStatus.CREATED);
    }

}
