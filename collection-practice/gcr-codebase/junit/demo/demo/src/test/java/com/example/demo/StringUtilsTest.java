package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("cba", utils.reverse("abc"));
    }

    @Test
    void testReverseWithEmptyString() {
        assertEquals("", utils.reverse(""));
    }

    @Test
    void testIsPalindromeTrue() {
        assertTrue(utils.isPalindrome("madam"));
    }

    @Test
    void testIsPalindromeFalse() {
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }

    @Test
    void testToUpperCaseWithNull() {
        assertNull(utils.toUpperCase(null));
    }
}
