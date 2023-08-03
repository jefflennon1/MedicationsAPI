package com.example.medications.management.resources;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medications.management.models.Medicament;

@RestController
@RequestMapping("/medicaments")
public class MedicamentsResources {

	@GetMapping("/hello")
	public String Hello() {
		return "Hello worda!";
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(value = "/import", 
	consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void importData(@RequestBody List<Medicament> medicaments) {
		Response response = new Response();
		 System.out.println(medicaments);
		 
	}
}
