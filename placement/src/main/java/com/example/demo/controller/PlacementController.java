package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Placement;
import com.example.demo.service.PlacementService;

@RestController 
@RequestMapping()
public class PlacementController {

	@Autowired
	PlacementService pser;
	
	 @PostMapping("/addpla")
	public Placement regPlacement(@RequestBody Placement p) {
		
		 return pser.addPlacement(p);
		
	}
	 
	@GetMapping("/getpla")
	public List<Placement> getPla(){
		
		return pser.getPlacement();
		
	}
	
	@DeleteMapping("/deletepla/{id}")
	public void deletepla(@PathVariable Long id) {
		
		pser.deletePlacement(id);
	}
	
	@PutMapping("/updatepla/{id}")
	public Placement updateName(
	        @PathVariable Long id,
	        @RequestParam String name) {

	    return pser.updateName(id, name);
	}
}
