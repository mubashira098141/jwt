package com.jwt.example.service;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "mubashira mirjamadar", "mub@mu.in"));
        store.add(new User(UUID.randomUUID().toString(), "swaleha mirjamadar", "swa@mu.in"));
        store.add(new User(UUID.randomUUID().toString(), "shifa mirjamadar", "shi@mu.in"));
    }
    public List<User>getUsers(){
        return this.store;
    }

    // Additional methods can be added here (e.g., to retrieve users)
}
