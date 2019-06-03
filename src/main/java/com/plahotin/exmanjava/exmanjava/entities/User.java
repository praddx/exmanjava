package com.plahotin.exmanjava.exmanjava.entities;

import com.plahotin.exmanjava.exmanjava.entities.domain.Email;
import com.plahotin.exmanjava.exmanjava.entities.domain.Password;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String login;

    @Embedded
    private Email email;

    public User(String login, Email email) {
        this.login = login;
        this.email = email;
    }

    public User(String login, String emailAddress) {
        this.login = login;
        this.email = Email.of(emailAddress);
    }

//    private Password password;
}
