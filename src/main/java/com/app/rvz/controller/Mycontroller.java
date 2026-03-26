package com.app.rvz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.rvz.entity.Fruit;
import com.app.rvz.respository.FruitRepo;
@RestController
@RequestMapping("/api/data")
public class Mycontroller {
    
    @Autowired
    FruitRepo repo;
    
    @GetMapping
    public List<Fruit> getFruit() {
        return repo.findAll();
    }
    
    @PostMapping
    public String addFruit(@RequestBody Fruit f) {
        repo.save(f);
        return "Added Successfully";
    }
}
