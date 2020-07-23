package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    Smartphone smartphone = new Smartphone(3, "One Plus 6", 30_000, "BBK Electronics");

    @Test
    public void shouldFindManufacturer() {
        boolean actual = smartphone.matches("bbk electronics");
        assertTrue(actual);
    }

    @Test
    public void shouldNotFindManufacturer() {
        boolean actual = smartphone.matches("LG");
        assertFalse(actual);
    }

    @Test
    public void shouldFindName() {
        boolean actual = smartphone.matches("one plus 6");
        assertTrue(actual);
    }

    @Test
    public void shouldNotFindName() {
        boolean actual = smartphone.matches("Note A 5");
        assertFalse(actual);
    }

}
