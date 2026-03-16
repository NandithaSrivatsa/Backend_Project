package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.College;
import com.example.demo.repository.CollegeRepository;

@Service
public class CollegeService {

	@Autowired
	public CollegeRepository crepo;
	
	public College addCollege(College clg) {
	
		return crepo.save(clg);
	
	}
	
	@GetMapping("/getcollege")
	public List<College> getCollege() {
	    return crepo.findAll();
	}
}

