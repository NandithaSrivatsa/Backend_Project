package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Placement;
import com.example.demo.repository.PlacementRepository;

@Service
public class PlacementService {
	
	@Autowired
	//Creating
	public PlacementRepository prepo;
	
	//Inserting
	public Placement addPlacement(Placement placement) {
	
		return prepo.save(placement);
	
	}
	
	//Retrieving
	public List<Placement> getPlacement()
	{
		return prepo.findAll();
	
	}
	
	//Deleting
	public void deletePlacement(Long id) {
		
		prepo.deleteById(id);
	}
	
	//Updating
	public Placement updateName(Long id, String name) {

	    Placement p1 = prepo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Not found"));

	    p1.setName(name);

	    return prepo.save(p1);
	}
}
