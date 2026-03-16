package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository urepo;
	
	public User addUser(User user) {
	
		return urepo.save(user);
	
	}

}

