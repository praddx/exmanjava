package com.plahotin.exmanjava.exmanjava.entities;

import com.plahotin.exmanjava.exmanjava.entities.domain.Email;
import com.plahotin.exmanjava.exmanjava.entities.domain.Password;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String login;

    private Email email;

//    private Password password;
}
