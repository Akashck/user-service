package com.UserService.controller;

import com.UserService.Repository.EmployeeRepository;
import com.UserService.model.Employee;
import com.UserService.service.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @Autowired
    EmployeeInterface employeeInterface;

    @PostMapping(value = "/createEmployee")
    public String createEmployee(@RequestBody Employee object) {
        String msg = "Employee is created";
        System.out.println(object + " Controller Class");
        employeeInterface.createEmployee(object);
        return msg;
    }

}
