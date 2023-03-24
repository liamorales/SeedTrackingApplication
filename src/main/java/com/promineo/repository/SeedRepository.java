package com.promineo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promineo.model.Seed;

public interface SeedRepository extends JpaRepository<Seed, Long> {

}
