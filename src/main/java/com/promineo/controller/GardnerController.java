package com.promineo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.promineo.model.Gardner;
import com.promineo.service.GardnerService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@RestController
@RequestMapping("/api/gardners")
@OpenAPIDefinition (info = @Info (title = "Gardner Service"), servers = {
		@Server (url = "http://localhost:8080", description = "Local server.")})
public class GardnerController {

	@Autowired
	private GardnerService gardnerService;

//	public GardnerController(GardnerService gardnerService) {
//		super();
//		this.gardnerService = gardnerService;
//	}
	
	//build create Gardener REST API 
	@PostMapping("gardners")
	@ResponseStatus(code=HttpStatus.CREATED)
	public ResponseEntity<Gardner>saveGardner(@RequestBody Gardner gardner){
		return new ResponseEntity<Gardner>(gardnerService.saveGardner(gardner),HttpStatus.CREATED);
	}
	
	//build get all seed REST API
		@GetMapping
		public List<Gardner> getAllGardners(){
			return gardnerService.getAllGardner();
	}
		
	//build get gardener by id Rest API
		@GetMapping("{id}")
		public ResponseEntity<Gardner>getGardnerById(@PathVariable("id")long gardnerId){
			return new ResponseEntity<Gardner>(gardnerService.getGardnerById(gardnerId), HttpStatus.OK);
	}
		
	//build update gardener
	@PutMapping("{id}")
	public ResponseEntity<Gardner>updateGardner(@PathVariable("id")long id, @RequestBody Gardner gardner){
	return new ResponseEntity <Gardner>(gardnerService.updateGardner(gardner, id),HttpStatus.OK);
}
}