package com.plahotin.exmanjava.exmanjava.entities.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.Embeddable;
import java.util.regex.Pattern;

import static org.apache.logging.log4j.util.Strings.isBlank;

@Data
@NoArgsConstructor
@Embeddable
public class Email {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private String emailAddress;

    private Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static Email of(String emailAddress) {
        var email = new Email(emailAddress);
        email.validate(emailAddress);
        return email;
    }

    private void validate(String emailAddress) {
        if (isBlank(emailAddress) || !EMAIL_PATTERN.matcher(emailAddress).matches()) {
            throw new IllegalArgumentException("Email address is incorrect");
        }
    }

}
