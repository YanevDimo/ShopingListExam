package com.example.shopinglistexam.service;

import com.example.shopinglistexam.model.serviceModel.UserServiceModel;

public interface UserService {
    void register(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);
}
