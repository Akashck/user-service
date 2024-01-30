package com.UserService.controller;

import com.UserService.model.Mobile;
import com.UserService.service.MobileName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mobile-service")
public class MobileController {
    @Autowired
    private MobileName mobileName;

    @GetMapping("/getMobile")
    public Mobile getMobile(@RequestParam("MobileName") String mobile) {
        return mobileName.getMobile();
    }
}
