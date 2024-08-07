package com.compost.controllers;

import com.compost.converters.UserConverter;
import com.compost.dtos.UserDTO;
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
    private final UserConverter userConverter;

    public UserController(UserService userService, UserConverter userConverter) {
        this.userService = userService;
        this.userConverter = userConverter;
    }

    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUserEntity(@RequestBody UserEntity userEntity){
        UserEntity user = userService.createUser(userEntity);
        UserDTO userDTO = userConverter.fromEntity(user);
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUsers(){
        List<UserEntity> userEntityList = userService.findAllUser();
        return new ResponseEntity<>(userEntityList, HttpStatus.OK);
    }

    @GetMapping("/status")
    public ResponseEntity<List<UserEntity>> getAllActiveUsers(){
        List<UserEntity> userEntityList = userService.findAllStatusTrue();
        return new ResponseEntity<>(userEntityList, HttpStatus.OK);
    }
}
