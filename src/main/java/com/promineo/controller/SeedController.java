package com.promineo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineo.model.Seed;
import com.promineo.service.SeedService;

@RestController 
@RequestMapping("/Seed_DB/seed")
public class SeedController{
	
	private SeedService seedService;
	
	public SeedController(SeedService seedService) {

		this.seedService = seedService;
	}
	
	//this is CREATING or POSTING a new seed
	@PostMapping()
	public ResponseEntity<Seed>saveSeed(@RequestBody Seed seed){
		return new ResponseEntity<Seed>(seedService.saveSeed(seed), 
				HttpStatus.CREATED);
	}
	
	//Getting all our seeds
	@GetMapping
	public List<Seed>getAllSeeds(){
		return seedService.getAllSeeds();
	}
	@GetMapping("{seed_id}")
	public ResponseEntity<Seed>getSeedById(@PathVariable("seed_id")int seedId){
		return new ResponseEntity<Seed>(seedService.getSeedById(seedId),
				HttpStatus.CREATED);
	}
	
	//Update seed
	@PutMapping("{seed_id}")
	public ResponseEntity<Seed>updateSeed(@PathVariable("seed_id")int seedId,
			@RequestBody Seed seed){
		return new ResponseEntity<Seed>(seedService.updateSeed(seed, seedId), 
				HttpStatus.OK);
	}
	
	//Delete Seed
	@DeleteMapping("{seed_id}")
	public ResponseEntity<String> deleteSeed(@PathVariable("seed_id")int seedId){
		seedService.deleteSeed(seedId);
		
		return new ResponseEntity<String>("You've deleted a seed entry",HttpStatus.OK);
		
	}
}



	

