package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // TODO: atividade 01
        // Crie um programa que receba do usuário: nome, peso e altura,
        // e exiba na tela o valor de seu IMC (índice de massa corporal) 
        // e o seu diagnóstico
        // Cálculo do IMC: peso/(altura*altura)
        // Diagnóstico: imc menor que 18.5 = abaixo do peso
        // imc entre 18.5 e 25 = peso ideal
        // imc entre 25 e 30 = acima do peso
        // imc entre 30 e 35 = obeso
        // imc entre 35 e 40 = obesidade nível 2
        // imc maior que 40 = obesidade mórbida

        // instaciar a classe scanner
        Scanner sc = new Scanner (System.in);

        // declaração de variáveis
        String nome;
        double peso;
        double altura;
        double imc;

        // entrada de dados
        System.out.println("Informe seu nome:");
        nome = sc.nextLine();
        System.out.println("Informe seu peso em kg:");
        peso = sc.nextDouble();
        System.out.println("Informe sua altura em metros:");
        altura = sc.nextDouble();

        // calcular imc
        imc = peso/(altura*altura);

        // mostra o imc para o usuario
        System.out.println(nome + " seu IMC é " + String.format("%.2f" , imc) + ".");
        
        // diagnostico
        if (imc < 18.5) {
        System.out.println(nome + " está abaixo do peso.");
        }
        else if (imc < 25) {
           System.out.println(nome + "está no epso ideal.");
        }
        else if (imc <30) {
            System.out.println(nome + "está acima do peso");
        }
        else if (imc <35) {
            System.out.println(nome + "obeso");
        }
        else if (imc <40) {
            System.out.println(nome + "obesidade nível 2");
        }
        else {
            System.out.println(nome + " está com obesidade mórbida.");
        }
        
        sc.close();
    }
}
 