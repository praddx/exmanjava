package com.plahotin.exmanjava.exmanjava.repository.user;

import com.plahotin.exmanjava.exmanjava.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
