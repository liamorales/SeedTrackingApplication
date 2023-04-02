package com.promineo.service_Impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineo.exception.ResourceNotFoundException;
import com.promineo.model.Seed;
import com.promineo.repository.SeedRepository;
import com.promineo.service.SeedService;

@Service
public class SeedServiceImpl implements SeedService {

	private SeedRepository seedRepository;
	
	@Autowired
	public SeedServiceImpl(SeedRepository seedRepository) {
		this.seedRepository = seedRepository;
	}

	//Save Seed
	@Override
	public Seed saveSeed(Seed seed) {
		return seedRepository.save(seed);
	}


	//get All seeds
	@Override
	public List<Seed> getAllSeeds() {
	return seedRepository.findAll();
	}

	//Get a seed by Id
	@Override
	public Seed getSeedById(int id) {
		return seedRepository.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("Seed", "Id", id)
				);
	}
	
	
	//Update Seed by Id
	@Override
	public Seed updateSeed(Seed seed, int id) {
		
		//we will first need to check that the seeds exists in the database
		Seed existingSeed = seedRepository.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("Seed", "Id", id)
		);
		
		existingSeed.setName(seed.getName());
		
		//save seed to DB
		seedRepository.save(existingSeed);
		return existingSeed;
	}


	@Override
	public void deleteSeed(int id) {
		
		//first we will see if the seed exists 
		Seed existingSeed = seedRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Seed", "Id", id)
		);
		seedRepository.delete(existingSeed);
	}

}
