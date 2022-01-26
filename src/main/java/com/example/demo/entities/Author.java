package com.example.demo.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Author {
	@Id  @GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String first;
private String last;
private String born;
private String sexe;

@OneToMany(mappedBy="author",cascade=CascadeType.ALL)
private List<Livre> livre;
}
