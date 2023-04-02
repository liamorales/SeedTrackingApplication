package com.promineo.service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineo.exception.ResourceNotFoundException;
import com.promineo.model.Gardner;
import com.promineo.repository.GardnerRepository;
import com.promineo.service.GardnerService;

@Service 
public class GardnerServiceImpl implements GardnerService{

	private GardnerRepository gardnerRepository;
	
	@Autowired
	public GardnerServiceImpl(GardnerRepository gardnerRepository) {
		super();
		this.gardnerRepository = gardnerRepository;
	}

//save gardener
	@Override
	public Gardner saveGardner(Gardner gardner) {
		return gardnerRepository.save(gardner);
	}

//get all gardeners
	@Override
	public List<Gardner> getAllGardners() {
		return gardnerRepository.findAll();
	}

//Get gardener by Id
	@Override
	public Gardner getGardnerById(int id) {
		return gardnerRepository.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("Gardner", "Id", id)
		);
	}

//Update Gardener by Id
	@Override
	public Gardner updateGardner(Gardner gardner, int id) {
		
		//First we need to make sure that the Gardener does exist
		Gardner existingGardner = gardnerRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Gardner", "Id", id));
		
		//we will create it in the case it doesn't exists
		existingGardner.setFirstName(gardner.getFirstName());
		existingGardner.setLastName(gardner.getLastName());
		existingGardner.setEmail(gardner.getEmail());
		existingGardner.setRegion(gardner.getRegion());
		existingGardner.setClimate(gardner.getClimate());
		existingGardner.setStartDate(gardner.getStartDate());
		
		//then we will save the existing gardener
		gardnerRepository.save(existingGardner);
		
		return existingGardner;
	}

//Delete Gardener
	@Override
	public void deleteGardner(int id) {
		
		//first we will see if the gardener exists 
				Gardner existingGardner = gardnerRepository.findById(id).orElseThrow(() -> 
				new ResourceNotFoundException("Gardner", "Id", id));
				
				gardnerRepository.delete(existingGardner);
		
	}
}
