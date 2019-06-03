package com.plahotin.exmanjava.exmanjava.entities.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailTest {

    @Test
    public void emailValidateTest() {
        var emailAddress = "palhotin@test.com";
        var email = Email.of(emailAddress);
        assertThat(emailAddress, is(email.getEmailAddress()));
    }

}