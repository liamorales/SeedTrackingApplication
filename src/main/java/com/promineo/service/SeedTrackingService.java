package com.promineo.service;

import java.util.List;

import com.promineo.model.SeedTracking;


public interface SeedTrackingService {
	
	//CREATING or POSTING a seed
	SeedTracking saveSeedTracking(SeedTracking seedTracking);

	//Get all seeds being tracked
	List<SeedTracking>getAllSeedTrackings();
	
//	//Get seedTracking by Id
//	SeedTracking getSeedTrackingById(int id);
//	
//	//Update seedTracking
//	SeedTracking updateSeedTrackingById(SeedTracking seedTracking, int id);
//	
//	//Delete seedTracking
//	void deleteSeedTracking(int id);

	
}
