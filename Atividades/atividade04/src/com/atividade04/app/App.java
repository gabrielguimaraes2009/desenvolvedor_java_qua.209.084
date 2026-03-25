package com.atividade04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO: atividade 04
        // Desenvolva um programa que crie um objeto da classe Veículo
        // (pode ser qualquer veiculo) com os atributos:
        // - Fabricante 
        // - Modelo
        // - Placa
        // - Ano
        // - Cor
        // O programa deverá mostrar os dados do veículo
        // NOTE: veículo não mostra dados, portanto não pode ser via método
        // NOTE: usuário  deverá  informar os dados do veiculo
        
        // instanciar a classe veículo
        Veiculo carro = new Veiculo();
        Scanner sc = new Scanner(System.in);

        // saída de dados
        System.out.println("Informe o fabricante:");
        carro.fabricante = sc.nextLine();
        System.out.println("Informe a placa:");
        carro.placa = sc.nextLine();
        System.out.println("Informe o ano do veiculo:");
        carro.ano = sc.nextInt();
        System.out.println("Informe a cor:");
        carro.cor = sc.nextLine();


        sc.close();
    }
}
