package com.plahotin.exmanjava.exmanjava.service.user;

import com.plahotin.exmanjava.exmanjava.entities.User;

import java.util.Optional;

public interface UserService {

    User createUser(String login, String email);

    Optional<User> getUser(long id);
}
