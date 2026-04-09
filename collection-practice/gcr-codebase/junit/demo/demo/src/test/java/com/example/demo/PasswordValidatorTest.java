package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(validator.isValid("Password"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
