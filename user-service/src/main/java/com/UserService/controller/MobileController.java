package com.UserService.controller;

import com.UserService.model.Mobile;
import com.UserService.service.MobileName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/mobile-service")
public class MobileController {
    @Autowired
    private MobileName mobileName;

    @GetMapping("/getMobile")
    public Mobile getMobile(@RequestParam("MobileName") String mobile) {
        System.out.println(mobile + "***********8" + mobileName);
        return mobileName.getMobile();
    }
}
