package com.projeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários da classe Calculadora usando JUnit 5.
 */
public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    // ==================== SOMA ====================

    @Test
    @DisplayName("Soma de dois números positivos")
    void testSomarPositivos() {
        assertEquals(5.0, calc.somar(2, 3));
    }

    @Test
    @DisplayName("Soma de dois números negativos")
    void testSomarNegativos() {
        assertEquals(-5.0, calc.somar(-2, -3));
    }

    @Test
    @DisplayName("Soma com zero")
    void testSomarComZero() {
        assertEquals(7.0, calc.somar(7, 0));
    }

    // ==================== SUBTRAÇÃO ====================

    @Test
    @DisplayName("Subtração de dois números positivos")
    void testSubtrairPositivos() {
        assertEquals(1.0, calc.subtrair(3, 2));
    }

    @Test
    @DisplayName("Subtração de dois números negativos")
    void testSubtrairNegativos() {
        assertEquals(1.0, calc.subtrair(-2, -3));
    }

    @Test
    @DisplayName("Subtração com zero")
    void testSubtrairComZero() {
        assertEquals(5.0, calc.subtrair(5, 0));
    }

    // ==================== MULTIPLICAÇÃO ====================

    @Test
    @DisplayName("Multiplicação de dois números positivos")
    void testMultiplicarPositivos() {
        assertEquals(6.0, calc.multiplicar(2, 3));
    }

    @Test
    @DisplayName("Multiplicação de dois números negativos")
    void testMultiplicarNegativos() {
        assertEquals(6.0, calc.multiplicar(-2, -3));
    }

    @Test
    @DisplayName("Multiplicação por zero")
    void testMultiplicarPorZero() {
        assertEquals(0.0, calc.multiplicar(5, 0));
    }

    // ==================== DIVISÃO ====================

    @Test
    @DisplayName("Divisão de dois números positivos")
    void testDividirPositivos() {
        assertEquals(2.0, calc.dividir(6, 3));
    }

    @Test
    @DisplayName("Divisão de dois números negativos")
    void testDividirNegativos() {
        assertEquals(2.0, calc.dividir(-6, -3));
    }

    @Test
    @DisplayName("Divisão por zero deve lançar exceção")
    void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }
}
