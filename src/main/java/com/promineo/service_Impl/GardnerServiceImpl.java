package com.promineo.service_Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.promineo.exception.ResourceNotFoundException;
import com.promineo.model.Gardner;
import com.promineo.repository.GardnerRepository;
import com.promineo.service.GardnerService;

@Service 
public class GardnerServiceImpl implements GardnerService{

	private GardnerRepository gardnerRepository;
	
	
	public GardnerServiceImpl(GardnerRepository gardnerRepository) {
		super();
		this.gardnerRepository = gardnerRepository;
	}


	@Override
	public Gardner saveGardner(Gardner gardner) {
		return gardnerRepository.save(gardner);
	}


	@Override
	public List<Gardner> getAllGardner() {
		return gardnerRepository.findAll();
	}


	@Override
	public Gardner getGardnerById(long id) {
		Optional<Gardner> gardner= gardnerRepository.findById(id);
		if (gardner.isPresent()) {
			return gardner.get();
		}else {
			throw new ResourceNotFoundException("Gardner", "Id","Id");
		}
	}


	@Override
	public Gardner updateGardner(Gardner gardner, long id) {
		
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
		
		return null;
	}


	@Override
	public void deleteGardner(long id) {
		
		//first we will see if the gardener exists 
				gardnerRepository.findById(id).orElseThrow(() -> 
				new ResourceNotFoundException("Gardner", "Id", id));
				
				gardnerRepository.deleteById(id);
		
	}
}
