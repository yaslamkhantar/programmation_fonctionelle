package com.example.demo.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AuthorRepository;
import com.example.demo.entities.Author;

@RestController
public class AuthorWeb {
	
	@Autowired
	private AuthorRepository authorrepository;
	
	private Author auteur;

	@CrossOrigin()
	@GetMapping(path="/auteur")
	public List<Author> list(){
		return authorrepository.findAll();
	}
	@GetMapping(path="/auteur/{id}")
	public Author findbyid(@PathVariable(value="id") Long id) {
		return authorrepository.findById(id).get();
	}
	@CrossOrigin()
	@PostMapping(path="/auteur")
	public void add(@RequestBody Author author) {
		
		authorrepository.save(author);
		
	}
	
	@PutMapping(path="/auteur/{id}")
	public Author set(@RequestBody Author author,@PathVariable Long id) {
		
		Author auteur=authorrepository.findById(id).get();
		auteur.setBorn(author.getBorn());
		auteur.setFirst(author.getFirst());
		auteur.setLast(author.getLast());
		auteur.setSexe(author.getSexe());
	final Author aut1=	authorrepository.save(auteur);
	return authorrepository.save(aut1);
	
		
	}
	@DeleteMapping(path="/auteur/{id}")
	public void delete(@PathVariable Long id) {
		authorrepository.deleteById(id);
		
	}

}
