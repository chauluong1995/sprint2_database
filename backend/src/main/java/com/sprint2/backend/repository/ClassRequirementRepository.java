package com.sprint2.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint2.backend.entity.ClassRequirement;

@Repository
public interface ClassRequirementRepository extends JpaRepository<ClassRequirement, Long> {
}
