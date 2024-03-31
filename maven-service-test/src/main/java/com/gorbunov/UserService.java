package com.gorbunov;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public UserDto getUser(Long id) {
        Optional<UserDto> userDto = userDao.findById(id).map(user -> new UserDto());
        if(userDto.isPresent()){
            return userDto.get();
        }
        return null;
    }
}
