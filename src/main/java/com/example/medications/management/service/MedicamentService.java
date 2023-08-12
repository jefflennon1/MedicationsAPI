package com.example.medications.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.medications.management.models.Medicament;
import com.example.medications.management.repository.MedicamentsRepository;

@Service
public class MedicamentService {

	@Autowired
	private MedicamentsRepository repository;
	
	public void importDataXls(List<Medicament> medicaments) {
		try {
			for(Medicament medicament : medicaments) { 
				
				Medicament medicationExisting = repository.findbyRegistro(medicament.getRegistro().toString());
				
				if(medicationExisting != null && !medicationExisting.getRegistro().isEmpty()) {
					repository.update(medicament);
				}else {
					repository.save(medicament);
				}
			}
		} catch (Exception e) {
			System.out.println("[ERROR]:"+ e.getMessage());
		}
	}

	 
	public List<Medicament> findByPincipioAtivoORProduto(String name){
		 return repository.findByPincipioAtivoORProduto(name); 
	}
}
