package com.atividade06.app;

import java.util.Scanner;

import com.atividade06.models.Carro;
import com.atividade06.models.Caminhao;
import com.atividade06.models.Moto;
import com.atividade06.models.Onibus;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String tipoVeiculo;

        System.out.println("Informe qual o tipo de veiculo que deseja cadastrar: ");
        System.out.println("Carro");
        System.out.println("Moto");
        System.out.println("Caminhão");
        System.out.println("Ônibus");
        tipoVeiculo = sc.nextLine();

        switch (tipoVeiculo) {
            case "A": 
            Moto moto  = new Moto(null,null,null,null,null,"A",null);
            // TODO: informar os dados da moto
            
        }




        sc.close();

    }
}
