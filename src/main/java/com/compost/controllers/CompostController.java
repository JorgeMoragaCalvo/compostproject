package com.compost.controllers;

import com.compost.entities.CompostEntity;
import com.compost.services.CompostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/composts")
public class CompostController {

    private final CompostService compostService;

    public CompostController(CompostService compostService) {
        this.compostService = compostService;
    }

    @PostMapping("/create")
    public ResponseEntity<CompostEntity> createCompostEntity(@RequestBody CompostEntity compostEntity){
        CompostEntity compost = compostService.createCompost(compostEntity);
        return new ResponseEntity<>(compost, HttpStatus.CREATED);
    }
}
