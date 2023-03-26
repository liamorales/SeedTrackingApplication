package com.promineo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promineo.model.SeedTracking;

public interface SeedTrackingRepository extends JpaRepository<SeedTracking, String> {

	static SeedTracking getOne(long seed_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
