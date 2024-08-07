package com.compost.converters;

import com.compost.dtos.UserDTO;
import com.compost.entities.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends AbstractConverter<UserEntity, UserDTO>{
    @Override
    public UserEntity fromDTO(UserDTO dto) {
        return null;
    }

    @Override
    public UserDTO fromEntity(UserEntity entity) {
        if(entity == null) return null;
        return UserDTO.builder()
                .name(entity.getName())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .creationDate(entity.getCreationDate())
                .build();
    }
}
