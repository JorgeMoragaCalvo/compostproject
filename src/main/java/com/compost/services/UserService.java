package com.compost.services;

import com.compost.entities.UserEntity;
import com.compost.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    public List<UserEntity> findAllUser(){
        return userRepository.findAll();
    }
}
