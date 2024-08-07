package com.compost.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class UserDTO {

    private String name;
    private String email;
    private String phone;
    private LocalDateTime creationDate;
}
