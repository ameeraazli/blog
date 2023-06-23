package com.example.blog.springdatajdbc.repository;

import com.example.blog.springdatajdbc.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
