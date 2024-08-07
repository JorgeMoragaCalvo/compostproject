package com.compost.controllers;

import com.compost.entities.UserEntity;
import com.compost.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUserEntity(@RequestBody UserEntity userEntity){
        UserEntity userCreated = userService.createUser(userEntity);
        return new ResponseEntity<>(userCreated, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUsers(){
        List<UserEntity> userEntityList = userService.findAllUser();
        return new ResponseEntity<>(userEntityList, HttpStatus.OK);
    }
}
