package com.atividade07.app;

import java.util.Scanner;

import com.atividade07.models.PessoaFisica;
import com.atividade07.models.Pessoa;
import com.atividade07.models.PessoaJuridica;
import com.atividade07.models.ContaPF;
import com.atividade07.models.ContaPJ;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica pf = new PessoaFisica(null, null, null);
        PessoaJuridica pj = new PessoaJuridica(null, null, null, null);
        int opcao = sc.nextInt();

        System.out.println("1 - Entrar como pessoa física");
        System.out.println("2 - Entrar como pessoa jurídica");
        opcao = sc.nextInt();
        System.out.println("Informe a agência: ");



        switch (opcao) {
            case 1:
               

                break;
            case 2:
                // Lógica para pessoa jurídica

                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
