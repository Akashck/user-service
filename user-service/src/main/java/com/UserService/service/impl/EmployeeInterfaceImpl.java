package com.UserService.service.impl;

import com.UserService.Repository.EmployeeRepository;
import com.UserService.Validator.EmployeeValidator;
import com.UserService.model.Employee;
import com.UserService.service.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeInterfaceImpl implements EmployeeInterface {

    @Autowired
    private final EmployeeRepository repository;

    public EmployeeInterfaceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employee createEmployee(Employee object){
        System.out.println(object + " service Class");
        EmployeeValidator validator = new EmployeeValidator();
        validator.validateEmployee(object);
        System.out.println(repository);

        repository.save(object);

        System.out.println(object + " service Class");

        return null;
    }

}
