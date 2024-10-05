package com.project.swachhbharatbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.swachhbharatbackend.models.PickupLocation;

public interface PickupLocationRepository extends JpaRepository<PickupLocation, Long> {
}
