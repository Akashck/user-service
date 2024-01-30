package com.UserService.service.impl;

import com.UserService.Repository.UserRepository;
import com.UserService.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UsersImpl implements com.UserService.service.Users {

    @Autowired
    UserRepository repository;

    @Override
    public List<UserModel> getUser() {
        return repository.findAll();
    }

    @Override
    public void updateUser(List<UserModel> user) {
        try {
            repository.saveAll(user);
        }
        catch (DataAccessException ex) {
            throw ex;
        }
    }

}
