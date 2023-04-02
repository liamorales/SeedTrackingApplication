package com.promineo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineo.model.SeedTracking;
import com.promineo.service.SeedTrackingService;

@RestController
@RequestMapping("/Seed_DB/seedTracking")
public class SeedTrackingController {
	
	private SeedTrackingService seedTrackingService;

	public SeedTrackingController(SeedTrackingService seedTrackingService) {
	
		this.seedTrackingService = seedTrackingService;
	}
	
	//this is CREATING or POSTING a new tracked seed
	@PostMapping()
	public ResponseEntity<SeedTracking>saveSeedTracking(@RequestBody SeedTracking seedTracking){
		return new ResponseEntity<SeedTracking>(seedTrackingService.saveSeedTracking(seedTracking),
				HttpStatus.CREATED);
	}
	
	//Getting all our seed tracking
	@GetMapping
	public List<SeedTracking>getAllSeedTrackings(){
		return seedTrackingService.getAllSeedTrackings();
	}
	
//	@GetMapping("{progress_id}")
//	public ResponseEntity<SeedTracking>getSeedTrackingById(@PathVariable("progress_id")int seedTrackingId){
//		return new ResponseEntity<SeedTracking>(seedTrackingService.getSeedTrackingById(seedTrackingId),
//				HttpStatus.CREATED);
//	}
//	
//	//Update SeedTracking
//	@PutMapping("{progress_id}")
//	public ResponseEntity<SeedTracking>updateSeedTracking(@PathVariable("progress_id")int seedTrackingId,
//			@RequestBody SeedTracking seedTracking){
//		return new ResponseEntity<SeedTracking>(seedTrackingService.updateSeedTrackingById(seedTracking, seedTrackingId),
//				HttpStatus.OK);
//	}
//	
//	//Delete SeedTracking 
//	@DeleteMapping("{progress_id}")
//	public ResponseEntity<String>deleteSeedTracking(@PathVariable("progress_id")int seedTrackingId){
//		seedTrackingService.deleteSeedTracking(seedTrackingId);
//		
//		return new ResponseEntity<String>("You've deleted seed progress", HttpStatus.OK);
//	}

}
