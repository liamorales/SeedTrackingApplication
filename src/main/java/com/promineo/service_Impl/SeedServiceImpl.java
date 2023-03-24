package com.promineo.service_Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.promineo.exception.ResourceNotFoundException;
import com.promineo.model.Seed;
import com.promineo.repository.SeedRepository;
import com.promineo.service.SeedService;

@Service
public class SeedServiceImpl implements SeedService {

	private SeedRepository seedRepository;
	
	
	public SeedServiceImpl(SeedRepository seedRepository) {
		super();
		this.seedRepository = seedRepository;
	}


	@Override
	public Seed saveSeed(Seed seed) {
		return seedRepository.save(seed);
	}


	@Override
	public List<Seed> getAllSeeds() {
	return seedRepository.findAll();
	}


	@Override
	public Seed getSeedById(long id) {
		Optional<Seed> seed= seedRepository.findById(id);
		if (seed.isPresent()) {
			return seed.get();
		}else {
			throw new ResourceNotFoundException("Seed", "Id","Id");
		}
	}

	@Override
	public Seed updateSeed(Seed seed, long id) {
		
		//we will first need to check that the seeds exists in the database
		Seed knownSeed = seedRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Seed", "Id", id));
		
		knownSeed.setName(seed.getName());
		//save seed to DB
		
		seedRepository.save(knownSeed);

		return knownSeed;
	}

}
