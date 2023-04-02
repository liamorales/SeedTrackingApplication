package com.promineo.service_Impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineo.model.SeedTracking;
import com.promineo.repository.SeedTrackingRepository;
import com.promineo.service.SeedTrackingService;

@Service 
public class SeedTrackingServiceImpl implements SeedTrackingService {

private SeedTrackingRepository seedTrackingRepository;
	
	@Autowired
	public SeedTrackingServiceImpl(SeedTrackingRepository seedTrackingRepository) {
		super();
		this.seedTrackingRepository = seedTrackingRepository;
	}

//Save seedTracking
	@Override
	public SeedTracking saveSeedTracking(SeedTracking seedTracking) {
		return seedTrackingRepository.save(seedTracking);
	}

//get all seedTracking
	@Override
	public List<SeedTracking> getAllSeedTrackings() {
	return seedTrackingRepository.findAll();
	}

//Get seedTracking by Id
//	@Override
//	public SeedTracking getSeedTrackingById(int id) {
//		return seedTrackingRepository.findById(id).orElseThrow(() ->
//		new ResourceNotFoundException("Gardner", "Id", id)
//		);
//	}
////Update SeedTracking
//	@Override
//	public SeedTracking updateSeedTrackingById(SeedTracking seedTracking, int id) {
//		
//		//we will first need to check that the seeds exists in the database
//		SeedTracking exisitingSeedTrackingId = seedTrackingRepository.findById(id).orElseThrow(
//				() -> new ResourceNotFoundException("SeedTracked", "Id", id));
//		
//		exisitingSeedTrackingId.setSeed_id(seedTracking.getSeed_id());
//		exisitingSeedTrackingId.setGardner_id(seedTracking.getGardner_id());
//		exisitingSeedTrackingId.setNotes_id(seedTracking.getNotes_id());
//		exisitingSeedTrackingId.setProgress_id(seedTracking.getProgress_id());
//		exisitingSeedTrackingId.setStatus_id(seedTracking.getStatus_id());
//		
//		
//		//save seedTracking to DB
//		seedTrackingRepository.save(exisitingSeedTrackingId);
//
//		return exisitingSeedTrackingId;
//	}

//Delete seedTracking
//	@Override
//	public void deleteSeedTracking(int id) {
//		
//		//first we will see if the seed exists 
//		SeedTracking exisitingSeedTrackingId = seedTrackingRepository.findById(id).orElseThrow(() -> 
//		new ResourceNotFoundException("Seed", "Id", id));
//		
//		seedTrackingRepository.delete(exisitingSeedTrackingId);
//		
//	}

}
