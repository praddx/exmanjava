package com.plahotin.exmanjava.exmanjava;

import com.plahotin.exmanjava.exmanjava.entities.User;
import com.plahotin.exmanjava.exmanjava.entities.domain.Email;
import com.plahotin.exmanjava.exmanjava.repository.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
            log.info("Preloading : " + repository.save(new User("Ivan", Email.of("ivan@test.com"))));
            log.info("Preloading : " + repository.save(new User("Petr", Email.of("petr@test.com"))));
        };
    }
}
