package com.riwi.Simulacro_Spring_Boot_Drill.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.Simulacro_Spring_Boot_Drill.domain.entities.Assignment;

@Repository
public interface AssigmentRepository extends JpaRepository<Assignment, Long>{
    
}
