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

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@RestController
@RequestMapping("/api/seeds")
@OpenAPIDefinition (info = @Info (title = "Seed Service"), servers = {
		@Server (url = "http://localhost:8080", description = "Local server.")})
public class SeedController {
	
	private SeedService seedService;

	public SeedController(SeedService seedService) {
		super();
		this.seedService = seedService;
	}
	
	//build create seed REST API
	@PostMapping("seeds")
	public ResponseEntity<Seed>saveSeed(@RequestBody Seed seed){
		return new ResponseEntity<Seed>(seedService.saveSeed(seed),HttpStatus.CREATED);
	}

	//build get all seeds REST API
	@GetMapping
	public List<Seed> getAllSeeds(){
		return seedService.getAllSeeds();
	}
	
	//build get seed REST API
	//http://localhost:8080/api/seed/1
	@GetMapping("{id}")
	public ResponseEntity<Seed> getSeedById(@PathVariable ("id") long id){
		return new ResponseEntity<Seed>(seedService.getSeedById(id), HttpStatus.OK);
	}
	
	//build update seed
	@PutMapping("{id}")

	public ResponseEntity<Seed>updateSeed(@PathVariable("id")long id, @RequestBody Seed seed){
		return new ResponseEntity<Seed>(seedService.updateSeed(seed, id), HttpStatus.OK);
	
	}
	//build delete seed
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteSeed(@PathVariable("id") long id){
		
		//delete seed from the database
		seedService.deleteSeed(id);
		return new ResponseEntity<String>("Seed deleted! ", HttpStatus.OK);
	}
	
	
	
}
