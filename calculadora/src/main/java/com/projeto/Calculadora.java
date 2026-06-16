package com.projeto;

/**
 * Classe Calculadora
 * Realiza as quatro operações matemáticas básicas.
 */
public class Calculadora {

    /**
     * Soma dois números.
     */
    public double somar(double a, double b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número do primeiro.
     */
    public double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dois números.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide o primeiro número pelo segundo.
     * Lança ArithmeticException se o divisor for zero.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: divisão por zero não é permitida.");
        }
        return a / b;
    }
}
