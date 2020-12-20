package com.appsdeveloperblog.photoapp.api.users.service;

import com.appsdeveloperblog.photoapp.api.users.shared.UserDto;

import java.util.UUID;

public class UsersServiceImpl implements UsersService {
    @Override
    public UserDto CreateUser(UserDto userDetails) {
        // Auto-generated method stub

        userDetails.setUserId(UUID.randomUUID().toString());

        return null;
    }
}
