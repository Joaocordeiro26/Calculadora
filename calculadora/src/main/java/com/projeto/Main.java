package com.projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=====================================");
        System.out.println("       BEM-VINDO À CALCULADORA       ");
        System.out.println("=====================================");

        while (opcao != 5) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            if (opcao == 5) {
                System.out.println("Encerrando... Até mais!");
                break;
            }

            if (opcao < 1 || opcao > 5) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            System.out.print("Digite o primeiro número: ");
            double a = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();

            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = calc.somar(a, b);
                    System.out.println("Resultado: " + a + " + " + b + " = " + resultado);
                    break;
                case 2:
                    resultado = calc.subtrair(a, b);
                    System.out.println("Resultado: " + a + " - " + b + " = " + resultado);
                    break;
                case 3:
                    resultado = calc.multiplicar(a, b);
                    System.out.println("Resultado: " + a + " x " + b + " = " + resultado);
                    break;
                case 4:
                    try {
                        resultado = calc.dividir(a, b);
                        System.out.println("Resultado: " + a + " ÷ " + b + " = " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
            }
        }

        scanner.close();
    }
}
