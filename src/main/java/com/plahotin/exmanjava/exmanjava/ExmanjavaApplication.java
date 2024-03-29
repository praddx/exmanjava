package com.plahotin.exmanjava.exmanjava;

import com.plahotin.exmanjava.exmanjava.entities.User;
import com.plahotin.exmanjava.exmanjava.entities.domain.Email;
import com.plahotin.exmanjava.exmanjava.repository.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ExmanjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExmanjavaApplication.class, args);

	}



}
