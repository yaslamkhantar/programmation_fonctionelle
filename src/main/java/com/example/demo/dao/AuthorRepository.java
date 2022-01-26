package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Author;

@RepositoryRestResource
public interface AuthorRepository extends JpaRepository<Author,Long> {

}
