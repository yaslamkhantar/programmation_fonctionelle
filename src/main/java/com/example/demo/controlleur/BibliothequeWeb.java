package com.example.demo.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Bibliothequerepository;
import com.example.demo.entities.Bibliotheque;
@RestController
public class BibliothequeWeb {
	@Autowired
	private Bibliothequerepository biblio;
	
	@GetMapping("/bibliotheque")
	public List<Bibliotheque> gett(){
		return biblio.findAll();
	}

}
