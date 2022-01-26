package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Livre {
	@Id  @GeneratedValue(strategy=GenerationType.AUTO)
	private Long isbn;
	private String  name;
	private double price;
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY) 
	@ManyToOne
	private Author author;
	
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	@ManyToOne
	
	private Bibliotheque bibliotheque;

}
