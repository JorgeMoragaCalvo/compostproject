package com.compost.services;

import com.compost.entities.UserEntity;
import com.compost.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserEntity userEntity){
        userEntity.setCreationDate(LocalDateTime.now());
        userEntity.setUpdateDate(LocalDateTime.now());
        userEntity.setStatus(true);
        return userRepository.save(userEntity);
    }

    public List<UserEntity> findAllUser(){
        return userRepository.findAll();
    }

    public List<UserEntity> findAllStatusTrue(){
        return userRepository.findAllByStatusIsTrue();
    }
}
