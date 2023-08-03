package com.example.medications.management.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medications.management.models.Medicament;
import com.example.medications.management.service.MedicamentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/medicaments")
public class MedicamentsResources {
 
	@Autowired
	private MedicamentService service;
 
	@PostMapping(value = "/importXls")
	public void importDataXls(@RequestBody  List<Medicament> medicaments) {
	 try {
			service.importDataXls(medicaments);
		} catch (Exception e) {
			// TODO: handle exception
		}
	} 
}
