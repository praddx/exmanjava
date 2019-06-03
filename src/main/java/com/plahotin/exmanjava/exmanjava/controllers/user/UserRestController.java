package com.plahotin.exmanjava.exmanjava.controllers.user;

import com.plahotin.exmanjava.exmanjava.entities.User;
import com.plahotin.exmanjava.exmanjava.repository.user.UserRepository;
import com.plahotin.exmanjava.exmanjava.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    @Autowired
    UserService service;

    @Autowired
    UserRepository repository;

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        return service.getUser(id).orElseThrow(() -> new IllegalArgumentException());
    }

    @PostMapping("")
    public User newUser(@RequestBody User user) {
//        User user = service.createUser(login, email);
        return repository.save(user);
    }


}
