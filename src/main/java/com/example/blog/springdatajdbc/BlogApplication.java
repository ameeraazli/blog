package com.example.blog.springdatajdbc;

import com.example.blog.springdatajdbc.model.Author;
import com.example.blog.springdatajdbc.model.Post;
import com.example.blog.springdatajdbc.repository.AuthorRepository;
import com.example.blog.springdatajdbc.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository posts, AuthorRepository authors) {
		return args ->  {
			AggregateReference<Author, Integer> dan = AggregateReference.to(authors.save(new Author(null, "Dan", "Vega", "danvega@gmail.com", "dvega")).id());
			posts.save(new Post("Hello, World!", "Welcome to my blog!", dan));
		};
	}

}
