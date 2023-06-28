package com.example.blog.springdatajdbc.model;

import org.springframework.data.annotation.Id;

public record Author(
        @Id Integer id,
        String firstName,
        String lastName,
        String email,
        String username
) {
}
