package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.PessoaFisica;
import com.encapsulamento.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica(null ,null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);
        Scanner sc = new Scanner(System.in);

        // dados da empresa
        empresa.setNomeFantasia("Funeraria Você é o próximo");
        empresa.setCnpj("00.000.000/0001-00");
        empresa.setEmail("funerario@contato.com.br");
        empresa.setTelefone("(00) 0000-0000");

        System.out.println("Informe o nome: ");
        usuario.setNome(sc.nextLine());
        System.out.println("Informe o cpf: ");
        usuario.setCpf(sc.nextLine());
        System.out.println("Informe o email: ");
        usuario.setEmail(sc.nextLine());
        System.out.println("Informe o telefone: ");
        usuario.setTelefone(sc.nextLine());

        // saída de dados
        System.out.println("\nDADOS DO USUÁRIO:\n ");
        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("CPF do usuário: " + usuario.getCpf());
        System.out.println("Email do usuário: " + usuario.getEmail());
        System.out.println("Telefone do usuário: " + usuario.getTelefone());
        System.out.println("\nDADOS DA EMPRESA:\n ");
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("CNPJ da empresa: " + empresa.getCnpj());
        System.out.println("Email da empresa: " + empresa.getEmail());
        System.out.println("Telefone da empresa: " + empresa.getTelefone());

        sc.close();
        
    }
}
