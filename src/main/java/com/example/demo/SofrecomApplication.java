package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.AuthorRepository;
import com.example.demo.dao.Bibliothequerepository;
import com.example.demo.dao.LivreRepository;
import com.example.demo.entities.Author;
import com.example.demo.entities.Bibliotheque;
import com.example.demo.entities.Livre;

@SpringBootApplication
public class SofrecomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SofrecomApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(AuthorRepository authorrepository,LivreRepository livrerepository,Bibliothequerepository biblio) {
		return args->{
		
			
			Author author=new Author(null,"yassine","lamkhantar","casablanca","homme",null);
			Author author1=new Author(null,"dounia","fares","roma","femme",null);
			Author author2=new Author(null,"hajar","hachim","eljadida","femme",null);
			
			authorrepository.save(author);
			authorrepository.save(author1);
			authorrepository.save(author2);
			
			
			Bibliotheque bibliotheque=new Bibliotheque("azx","casablanca","lhobosse",null,200);
			Bibliotheque bibliotheque1=new Bibliotheque("tar","fes","narjisse",null,100);
			Bibliotheque bibliotheque2=new Bibliotheque("zip","agadir","amougar",null,149);
			
			
			
			biblio.save(bibliotheque);
			biblio.save(bibliotheque1);
			biblio.save(bibliotheque2);
			
			authorrepository.findAll().forEach(s->{
				
				biblio.findAll().stream().forEach(d->{
				//	System.out.println(s+"   "+d);
					Livre livre=new Livre();
					livre.setAuthor(s);
					livre.setBibliotheque(d);
					livre.setName("antigone");
					livre.setPrice(290.0);
					livrerepository.save(livre);
				});
			});
	System.out.println("tout est avec succes");
	


		
		};
	}

}
