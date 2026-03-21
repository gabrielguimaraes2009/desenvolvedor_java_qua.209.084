package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO: atividade 02
        // Crie um programa que receba do usuário o nome e a idade (1x)
        // e depois exiba uma lista de filmes
        // Sala 01 - A roda Quadrada - Livre
        // Sala 02 - A volta dos Que Não Foram - 12 anos
        // Sala 03 - Poeira em Alto Mar - 14 anos
        // Sala 04 - As tranças do Rei Careca - 16 anos
        // Sala 05 - A Vingança do Peixe Frito - 18 anos
        // O usuário deverá escolher o filme desejado. Se estiver a idade
        // mínima para ver o filme, o programa imprime o ingresso e 
        // encerra. Se o usuário não tiver a idade minima, o programa
        // bloqueia a entrada e re-exibe a lista  de filmes para o usuário
        // escolher outro filme

        // declaração de variaveis
        String nome;
        String sala;
        String filme = null;
        int idade;
        int idadeMin = 0;
        
        // instanciar a classe Scanner
        Scanner sc = new Scanner(System.in);

        
        // entrada de dados
        System.out.println("Informe seu nome:");
        nome = sc.nextLine();
        System.out.println("Informe sua idade:");
        idade = sc.nextInt();

        sc.nextLine();

        do{
        System.out.println("Informe o número do filme desejado");
        System.out.println("Sala 01 - A roda Quadrada - Livre");
        System.out.println("Sala 02 - A volta dos Que Não Foram - 12 anos");
        System.out.println("Sala 03 - Poeira em Alto Mar - 14 anos");
        System.out.println("Sala 04 - As tranças do Rei Careca - 16 anos");
        System.out.println("Sala 05 - A vingança do Peixe Frito - 18 anos");
        sala = sc.nextLine();

        switch (sala) {
            case "1":
                filme = "A roda Quadrada";
                break;
            case "2":
                filme = "A volta dos que não foram";
                idadeMin = 12;
                break;
            case "3":
                filme = "Poeira em alto mar";
                idadeMin = 14;
                break;
            case "4":
                filme = "As tranças do Rei Careca";
                idadeMin = 16;
            case "5":
                filme = "A Vingança do Peixe Frito";
                idadeMin = 18;
                break;
            default:
                idadeMin = idade + 1;    

        }

        if (idade >= idadeMin) {
            System.out.println("Ingresso comprado por " + nome + " para");
        System.out.println("Filme: " + filme + ".");
        System.out.println("Tenha um bom filme!!! =D");
        }
        else {
            System.out.println("Entrada não liberada para " + nome + ".");
            System.out.println("Favor escolher outro filme.");
        }
    } while(idade <=idadeMin);

    sc.close();

}
}
