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

import com.promineo.model.Gardner;
import com.promineo.service.GardnerService;



@RestController
@RequestMapping("/Seed_DB/gardner")

public class GardnerController {

	private GardnerService gardnerService;

	public GardnerController(GardnerService gardnerService) {
		this.gardnerService = gardnerService;
	}
	
	//this is CREATING or POSTING a new seed
	@PostMapping()
	public ResponseEntity<Gardner>saveGardner(@RequestBody Gardner gardner){
		return new ResponseEntity<Gardner>(gardnerService.saveGardner(gardner),
				HttpStatus.CREATED);
	}
	
	//Getting all of our gardeners
		@GetMapping
		public List<Gardner> getAllGardners(){
			return gardnerService.getAllGardners();
	}
		

		@GetMapping("{gardner_id}")
		public ResponseEntity<Gardner>getGardnerById(@PathVariable("gardner_id")int gardnerId){
			return new ResponseEntity<Gardner>(gardnerService.getGardnerById(gardnerId), HttpStatus.CREATED);
	}
		
	//update gardener
	@PutMapping("{gardner_id}")
	public ResponseEntity<Gardner>updateGardner(@PathVariable("gardner_id")int gardnerId, @RequestBody Gardner gardner){
	return new ResponseEntity <Gardner>(gardnerService.updateGardner(gardner, gardnerId),HttpStatus.OK);
}
	
	// delete gardener
	@DeleteMapping("{gardner_id}")
	public ResponseEntity<String> deleteGardner(@PathVariable("gardner_id") int gardnerId){
		
		//delete gardener from the database
		gardnerService.deleteGardner(gardnerId);
		
		return new ResponseEntity<String>("Gardner was deleted! ", HttpStatus.OK);
	}
}