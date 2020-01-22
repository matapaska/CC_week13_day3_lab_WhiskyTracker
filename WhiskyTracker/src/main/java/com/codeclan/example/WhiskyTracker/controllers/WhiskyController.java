package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/years/{year}")
    public List<Whisky> findWhiskiesByYear(@PathVariable int year){
        return whiskyRepository.findWhiskiesByYear(year);
    }

    @GetMapping(value = "/distilleries/{id}/{age}")
    public List<Whisky> findWhiskiesByDistilleryIdAndAge(@PathVariable Long id, @PathVariable int age){
        return whiskyRepository.findWhiskiesByDistilleryIdAndAge(id, age);
    }

    @GetMapping(value = "/distilleries/regions/{region}")
    public List<Whisky> findWhiskiesByDistilleryRegion(@PathVariable String region){
        return whiskyRepository.findWhiskiesByDistilleryRegion(region);
    }

   



}
