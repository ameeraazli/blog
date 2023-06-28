package com.example.blog.springdatajdbc.repository;

import com.example.blog.springdatajdbc.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
