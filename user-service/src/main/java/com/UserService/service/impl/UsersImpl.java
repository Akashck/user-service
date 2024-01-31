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

    public static List<UserModel> setManuallyUsers() {
        List<UserModel> model = new ArrayList<>();
        UsersImpl users = new UsersImpl();
      //  users.userData(model);
        return model;
    }

    private List<UserModel> userData(List<UserModel> models) {
        UserModel data = new UserModel();
        data.setUserId(101);
        data.setUserName("user101");
        data.setAddress("HYD");

        UserModel data2= new UserModel();
        data2.setUserId(102);
        data2.setUserName("user102");
        data2.setAddress("BLR");

        UserModel data3 = new UserModel();
        data3.setUserId(103);
        data3.setUserName("user103");
        data3.setAddress("CHN");

        models.add(data);
        models.add(data2);
        models.add(data3);

        return models;
    }

}
