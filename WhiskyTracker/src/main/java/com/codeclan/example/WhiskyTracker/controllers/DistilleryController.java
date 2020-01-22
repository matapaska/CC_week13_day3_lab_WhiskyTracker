package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/regions/{region}")
    public List<Distillery> findDistilleriesByRegion(@PathVariable String region){
        return distilleryRepository.findDistilleriesByRegion(region);
    }

    @GetMapping(value = "/whiskies/ages/{age}")
    public List<Distillery> findDistilleriesByWhiskiesAge(@PathVariable int age){
        return distilleryRepository.findDistilleriesByWhiskiesAge(age);
    }






}