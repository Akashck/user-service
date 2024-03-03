package com.UserService.Validator;

import com.UserService.model.Employee;
import org.h2.util.StringUtils;

public class EmployeeValidator {

    public void validateEmployee(Employee object) {
        System.out.println(object + " Validator");

        if (StringUtils.isNullOrEmpty(object.getName())) {
            throw new RuntimeException("Employee Name cannot be null or empty");
        }

        if (object.getId() <= 0) {
            throw new RuntimeException("Employee id cannot be null or empty");
        }

        if (object.getSalary() <= 0) {
            throw new RuntimeException("Employee Salary cannot be null or empty");
        }

    }
}
