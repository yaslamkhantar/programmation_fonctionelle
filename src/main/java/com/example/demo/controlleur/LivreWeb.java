package com.example.demo.controlleur;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.LivreRepository;
import com.example.demo.entities.Livre;
@RestController
public class LivreWeb {
private LivreRepository livrerepository;
	public LivreWeb(LivreRepository livrerepository) {
		this.livrerepository=livrerepository;
	}
	
	@GetMapping(path="/livre")
	public List<Livre> gett(){
		return livrerepository.findAll();
	}
}
