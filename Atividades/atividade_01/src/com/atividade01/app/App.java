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

        // estaciar a scanner

        Scanner sc = new Scanner (System.in);

        String nome;
        double peso, altura, imc, resultado;

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Informe  sua altura: ");
        altura = sc.nextDouble();

        // calcular imc
        imc = peso/(altura*altura);

        if (imc >=18.5 && imc <=25) {
            resultado = "Peso ideal";
        }
        else if (imc >=25 && imc <=30) {
            resultado = "Acima do peso";
        }
        else if (imc >=30 && imc <=35) {
            resultafo = "Obeso";
        }
        else if (imc >=35 && imc <=40) {
            resultado = "Obesidade nível 2"; 
        }
        else if (imc >40) {
            resultado = "Obesidade mórbida";
        }

        System.out.println("nome" + imc);


        

        
        
        
        
        
        
        
        sc.close();









    }
}
 