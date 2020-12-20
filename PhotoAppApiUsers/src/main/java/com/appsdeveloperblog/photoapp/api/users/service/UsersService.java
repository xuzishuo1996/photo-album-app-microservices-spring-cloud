package com.appsdeveloperblog.photoapp.api.users.service;

import com.appsdeveloperblog.photoapp.api.users.shared.UserDto;

public interface UsersService {
    // Dto: Data Transfer Object
    UserDto CreateUser(UserDto userDetails);
}
