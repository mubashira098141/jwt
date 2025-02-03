package com.jwt.example.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private String id;
    private String name;
    private String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
