package com.promineo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineo.model.SeedTracking;

@Repository
public interface SeedTrackingRepository extends JpaRepository<SeedTracking, String> {




}
