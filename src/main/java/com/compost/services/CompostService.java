package com.compost.services;

import com.compost.entities.CompostEntity;
import com.compost.repositories.CompostRepository;
import org.springframework.stereotype.Service;

@Service
public class CompostService {

    private final CompostRepository compostRepository;

    public CompostService(CompostRepository compostRepository) {
        this.compostRepository = compostRepository;
    }

    public CompostEntity createCompost(CompostEntity compostEntity){
        return compostRepository.save(compostEntity);
    }
}
