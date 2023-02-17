package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    public static final String VIGLIANISI = "MyClass{name='Francesco', surname='Viglianisi'}";

    @Test
    void myTest() {
        String printMyClass = Mapper.map("Francesco","Viglianisi");

        assertEquals(VIGLIANISI,printMyClass);

    }
}