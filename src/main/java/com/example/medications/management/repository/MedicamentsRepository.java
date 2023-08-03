package com.example.medications.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medications.management.models.Medicament;

@Repository
public interface MedicamentsRepository extends JpaRepository<Medicament, String>{

}
