package com.example.blog.springdatajdbc;

import com.example.blog.springdatajdbc.model.Post;
import com.example.blog.springdatajdbc.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository posts) {
		return args ->  {
			posts.save(new Post("Hello, World!", "Welcome to my blog!"));
		};
	}

}
