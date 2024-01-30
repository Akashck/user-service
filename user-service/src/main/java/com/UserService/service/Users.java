package com.UserService.service;

import com.UserService.model.UserModel;

import java.util.List;

public interface Users {
    public List<UserModel> getUser();
    public void updateUser(List<UserModel> user);
}
