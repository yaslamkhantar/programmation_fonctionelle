package com.example.demo.entities;




import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Bibliotheque {

	@Id
	private String reference;
	private String ville;
	private String name;
	
	@OneToMany(mappedBy="bibliotheque",cascade=CascadeType.ALL)
	private List<Livre> livre;
	private int quantity;
	
	
	
	
}
