package com.anushka.myshop.services;

import com.anushka.myshop.payload.SingIn;
import com.anushka.myshop.payload.UserDto;

public interface UserService {


    UserDto CreateUser(UserDto userDto);

    SingIn SingIn(SingIn singIn);
}
