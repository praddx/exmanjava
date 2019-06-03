package com.plahotin.exmanjava.exmanjava.service.user;

import com.plahotin.exmanjava.exmanjava.entities.User;
import com.plahotin.exmanjava.exmanjava.entities.domain.Email;
import com.plahotin.exmanjava.exmanjava.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User createUser(String login, String email) {
        Email emailAddress = Email.of(email);
        User user = new User(login, emailAddress);
        return user;
    }

    @Override
    public Optional<User> getUser(long id) {
        return repository.findById(id);
    }
}
