package com.rishu.user_registration.controller;

import com.rishu.user_registration.model.User;
import com.rishu.user_registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService service;

    // ✅ CREATE USER
    @PostMapping
    public User registerUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    // ✅ FETCH ALL USERS
    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    // ✅ DELETE USER
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        service.deleteUser(id);
        return "User Deleted ✅";
    }

    // ✅ UPDATE USER
    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        return service.updateUser(id, user);
    }
}
