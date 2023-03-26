package com.promineo.service_Impl;

import java.util.List;
import java.util.Optional;
import com.promineo.exception.ResourceNotFoundException;
import com.promineo.model.SeedTracking;
import com.promineo.repository.SeedTrackingRepository;

public class SeedTrackingServiceImpl {

private SeedTrackingRepository seedTrackingRepository;
	
	
	public SeedTrackingServiceImpl(SeedTrackingRepository seedTrackingRepository) {
		super();
		this.seedTrackingRepository = seedTrackingRepository;
	}


	public SeedTracking saveSeedTracking(SeedTracking seedTracking) {
		return seedTrackingRepository.save(seedTracking);
	}


	public List<SeedTracking> trackAllSeeds() {
	return seedTrackingRepository.findAll();
	}


	public SeedTracking getSeedTrackingById(String id) {
		Optional<SeedTracking> seedTracking= seedTrackingRepository.findById(id);
		if (seedTracking.isPresent()) {
			return seedTracking.get();
		}else {
			throw new ResourceNotFoundException("SeedTracked", "Id","Id");
		}
	}

	public SeedTracking updateSeedTracking(SeedTracking seedTracking, String id) {
		
		//we will first need to check that the seeds exists in the database
		SeedTracking knownSeedTracking = seedTrackingRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("SeedTracked", "Id", id));
		
		knownSeedTracking.setSeed_id(seedTracking.getSeed_id());
		knownSeedTracking.setGardner_id(seedTracking.getGardner_id());
		knownSeedTracking.setNotes_id(seedTracking.getNotes_id());
		knownSeedTracking.setProgress_id(seedTracking.getProgress_id());
		knownSeedTracking.setStatus_id(seedTracking.getStatus_id());
		
		
		//save seed to DB
		
		seedTrackingRepository.save(knownSeedTracking);

		return knownSeedTracking;
	}


	public void deleteSeedTracking(String id) {
		
		//first we will see if the seed exists 
		seedTrackingRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Seed", "Id", id));
		
		seedTrackingRepository.deleteById(id);
		
	}

}
