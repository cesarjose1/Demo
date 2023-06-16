package com.example.junit.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalculadoraTest {

    /**
     * Regla de jUnit que guarda el nombre del test actual.
     */

    /**
     * Método que será invocado antes de ejecutar los test.
     */
    @BeforeAll
    public static void setUpClass() {
        System.out.println("[ TESTS START ] - Comienzan a ejecutarse los Test Unitarios.");
    }

    /**
     * Método que será invocados antes de cada test
     */
    @BeforeEach
    public void setUp() {
        System.out.print("***********************************************************************************************************\n");
        System.out.println("[ EJECUTANDO ] ");
    }

    /**
     * Método que será invocados después de cada test
     */
    @AfterEach
    public void tearDown() {
        System.out.println("[ TERMINADO ] ");
        System.out.print("***********************************************************************************************************\n");
    }

    /**
     * Método que será invocado después de ejecutar los test.
     */
    @AfterAll
    public static void tearDownClass() {
        System.out.println("[ TESTS FINISH ] -  Terminan de ejecutarse Test Unitarios.");
    }
}