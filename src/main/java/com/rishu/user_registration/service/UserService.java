package com.rishu.user_registration.service;

import com.rishu.user_registration.model.User;
import com.rishu.user_registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public void deleteUser(String id) {
        repository.deleteById(id);
    }

    public User updateUser(String id, User user) {
        user.setId(id);
        return repository.save(user);
    }
}
