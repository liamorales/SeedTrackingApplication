package com.promineo.service;

import java.util.List;

import com.promineo.model.SeedTracking;


public interface SeedTrackingService {


	//Here we are writing our foundations for our get methods
	List<SeedTracking>trackAllSeeds();
	
	//Here we are writing our foundations for our put methods
	SeedTracking getSeedTrackingById(String id);
	
	//Here we are writing our foundations for our update methods
	SeedTracking updateSeedTrackingById(SeedTracking seedTracking, String id);
	
	//Here we will be writing our foundation for our delete method
	void deleteSeedTracking(String id);
}
