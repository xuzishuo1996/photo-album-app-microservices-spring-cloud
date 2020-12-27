package com.appsdeveloperblog.photoapp.api.users.service;

import com.appsdeveloperblog.photoapp.api.users.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {
    // Dto: Data Transfer Object
    UserDto CreateUser(UserDto userDetails);
    UserDto getUserDetailsByEmail(String email);

    UserDto getUserByUserId(String userId);
}
