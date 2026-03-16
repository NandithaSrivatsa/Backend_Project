package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.College;
import com.example.demo.entity.Placement;
import com.example.demo.repository.CollegeRepository;

import com.example.demo.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    CollegeService repo;

    @PostMapping("/addclg")
    public College regCollege(@RequestBody College collage) {
        return repo.addCollege(collage);
    }
    
    @GetMapping("/getclg")
	public List<College> getClg(){
		
		return repo.getCollege();
		
	}
}