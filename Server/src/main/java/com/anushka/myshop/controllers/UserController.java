package com.anushka.myshop.controllers;

import com.anushka.myshop.payload.SingIn;
import com.anushka.myshop.payload.UserDto;
import com.anushka.myshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.HttpStatus;
=======
import org.springframework.http.HttpStatusCode;
>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

<<<<<<< HEAD
    @PostMapping("/signup")
    public ResponseEntity<UserDto> signup(@RequestBody UserDto userDto) {
        UserDto createdUser = userService.CreateUser(userDto);
        return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }

    @PostMapping("/signin")
    public ResponseEntity<SingIn> signin(@RequestBody SingIn singIn) {
        SingIn signedInUser = userService.SingIn(singIn);
        return new ResponseEntity<>(signedInUser, HttpStatus.OK);
=======

    @PostMapping("/singup")
    public ResponseEntity<UserDto> CreateUser(@RequestBody UserDto userDto){

        UserDto userDto1 = this.userService.CreateUser(userDto);

        return new ResponseEntity<>(userDto1, HttpStatusCode.valueOf(200));
    }


    @PostMapping("/singin")
    public ResponseEntity<SingIn> CreateUser(@RequestBody SingIn singIn){

        SingIn singIn1 = this.userService.SingIn(singIn);
        return new ResponseEntity<>(singIn1, HttpStatusCode.valueOf(200));
>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179
    }
}
