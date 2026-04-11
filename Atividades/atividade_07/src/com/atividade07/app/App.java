package com.atividade07.app;

import java.util.Scanner;

import com.atividade07.models.PessoaFisica;
import com.atividade07.models.PessoaJuridica;
import com.atividade07.models.ContaPF;
import com.atividade07.models.ContaPJ;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String pessoaTipo;
        String opcao = sc.nextLine();
        double valor;
        PessoaFisica PF = new PessoaFisica(null, null, null);
        ContaPF ccpf = new ContaPF("1234-5", "1010-1", 0, PF);
        PessoaJuridica pj = new PessoaJuridica(null,null,null,null);
        ContaPJ ccpj = new ContaPJ("123-5", "20101-1", 0, pj);

        System.out.println("Escolha o tipo de pessoa que deseja cadastrar:");
        System.out.println("PF - Pessoa Fisica");
        System.out.println("PJ - Pessoa Juridica");
        pessoaTipo = sc.nextLine();

        switch (pessoaTipo) {
            case "PF":
                
                System.out.println("Informe o nome do usuario:");
                PF.setNome(sc.nextLine());
                System.out.println("Informe o CPF do usuario:");
                PF.setCpf(sc.nextLine());
                System.out.println("Informe o email do usuario:");
                PF.setEmail(sc.nextLine());

                ccpf.setPf(PF);

                    break;
            case "PJ":

                System.out.println("Informe a razão social da empresa:");
                pj.setRazaosocial(sc.nextLine());
                System.out.println("Informe o nome fantasia da empresa:");
                pj.setNomeFantasia(sc.nextLine());
                System.out.println("Informe o CNPJ da empresa:");
                pj.setCnpj(sc.nextLine());
                System.out.println("Informe o email da empresa:");
                pj.setEmail(sc.nextLine());

                ccpj.setPj(pj);

                break;

                default:
                    System.out.println("Pessoa 404");

                    if ("PF".equals(pessoaTipo) || "PJ".equals(pessoaTipo));
                do{
                    // MENU
                    System.out.println("---- Opcao do Roubank ----");
                    System.out.println("1 - Consultar dados da conta");
                    System.out.println("2 - Fazer depósito ");
                    System.out.println("3 - Fazer saque ");
                    System.out.println("4 - Sair do programa");
                    opcao = sc.nextLine();

                    switch (opcao) {
                        case"1":
                       if ("PF".equals(pessoaTipo)) {
                                ccpf.exibirDados();
                            }
                            else {
                                ccpj.exibirDados();
                            }
                            break;
                        case "2":
                            System.out.println("Informe o valor do depósito em R$:");
                            valor = sc.nextDouble();

                            sc.nextLine();
                            
                            if ("PF".equals(pessoaTipo)) {
                                if (valor > 0) {
                                    System.out.println("Valor depositado com sucesso.");
                                    System.out.println("Saldo atual: R$ " + ccpf.fazerDeposito(valor));
                                }
                                else {
                                    System.out.println("Valor inválido.");
                                }
                            }
                            else {
                                if (valor > 0) {
                                    System.out.println("Valor depositado com sucesso.");
                                    System.out.println("Saldo atual: R$ " + ccpj.fazerDeposito(valor));
                                }
                            }
                            break;
                        case "3":
                            System.out.println("Informe o valor do saque em R$");
                            valor = sc.nextDouble();

                            sc.nextLine();

                            if ("PF".equals(pessoaTipo)) {
                                if (valor > 0 && valor <= ccpf.getSaldo()) {
                                    System.out.println("Saque efetuado com sucesso.");
                                    System.out.println("Saldo atual: R$ " + ccpf.fazerSaque(valor));
                                }
                                else {
                                    System.out.println("Valor do saque inválido.");
                                }
                            }
                            else {
                                if (valor > 0 && valor <= ccpj.getSaldo()) {
                                    System.out.println("Saque efetuado com sucesso.");
                                    System.out.println("Saldo atual: R$ " + ccpj.fazerSaque(valor));
                                }
                                else {
                                    System.out.println("Valor do saque inválido.");
                                }
                            }
                            break;
                        case "4":
                            System.out.println("Programa encerrado.");
                            System.out.println("Volte sempre.");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (!"4".equals(opcao));
            }
            else {
                System.out.println("Não foi possível cadastrar novo titular.");
                System.out.println("Programa encerrado.");
            }
        }

        sc.close();
    }
}