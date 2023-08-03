package com.example.medications.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medications.management.models.Medicament;
import com.example.medications.management.repository.MedicamentsRepository;

@Service
public class MedicamentService {

	@Autowired
	private MedicamentsRepository repository;
	
	public void importDataXls(List<Medicament> medicaments) {
		try {
			repository.saveAll(medicaments);
		} catch (Exception e) {
			System.out.println("[ERROR]:"+ e.getMessage());
		}
	}
}
