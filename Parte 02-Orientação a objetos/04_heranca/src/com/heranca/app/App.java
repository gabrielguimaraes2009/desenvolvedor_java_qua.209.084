package com.heranca.app;

import java.util.Scanner;
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        // dados da empresa
        empresa.razaoSocial = "Alex SA";
        empresa.nomeFantasia = "Kids Graça Eventos Infatis";
        empresa.cnpj = "12.345.678/0001-90";
        empresa.email = "kidsgraça@contato.com.br";
        empresa.telefone = "(11) 98765-4321";
        empresa.endereço = "Campo da esperança";

        // dados do usuário
        System.out.println("DADOS DO USUÁRIO");
        System.out.print("Informe o nome do usuário: ");
        usuario.nome = sc.nextLine();
        System.out.print("Informe o CPF do usuário: ");
        usuario.cpf = sc.nextLine();
        System.out.print("Informe o e-mail do usuário: ");
        usuario.email = sc.nextLine();
        System.out.print("Informe o telefone do usuário: ");
        usuario.telefone = sc.nextLine();
        System.out.print("Informe a idade do usuário: ");
        usuario.idade = sc.nextInt();
        System.out.println("Informe o endereço do usuário: ");
        usuario.endereço = sc.nextLine();
        // saída de dados
        System.out.println(usuario.apresentar());
        System.out.println(empresa.recepcionar(usuario.nome));

        sc.close();
    }
}
