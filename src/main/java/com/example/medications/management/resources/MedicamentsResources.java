package com.example.medications.management.resources;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medications.management.models.Medicament;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/medicaments")
public class MedicamentsResources {
 
	@PostMapping(value = "/import")
	public void importData(@RequestBody  List<Medicament> medicaments) {
		//Response response = new Response();
		 System.out.println(medicaments);
	} 
}
