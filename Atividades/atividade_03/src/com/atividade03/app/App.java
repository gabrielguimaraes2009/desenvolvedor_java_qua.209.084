package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        // declaração de variaveis
        double num1;
        double num2;
        double result;
        String operador;


        // entrada de dados
        System.out.println("Informe o 1º número");
        num1 = sc.nextDouble();
        System.out.println("Informe o 2º número:");
        num2 = sc.nextDouble();

        // limpeza de buffer
        sc.nextLine();
        // menu
        System.out.println("Informe a operação desejada");
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");
        System.out.println("5 - sair do programa");
        operador = sc.nextLine();

        // verifica a operação desejada
        switch (operador) {
            case "1":
                result = num1 + num2;
                System.out.println("O valor da soma é " + result);
                break;
            case "2":
                result = num1 - num2;
                System.out.println("O valor da subtração é " + result);
                break;
            case "3":
                result = num1 * num2;
                System.out.println("O valor da multiplicação é " + result);
            case "4":
                result = num1 / num2;
                System.out.println("O valor da divisão é " + result);
            case "5":
                System.out.println("Encerrar programa");
                break;
            default:
                System.out.println("Operaçaõ inválida");

        }

    }
}
