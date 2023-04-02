package com.promineo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineo.model.Seed;

@Repository
public interface SeedRepository extends JpaRepository<Seed, Integer> {

	
}
