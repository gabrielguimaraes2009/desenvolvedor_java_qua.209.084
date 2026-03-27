package com.atividade05.app;

import com.atividade05.models.Aluno;
import com.atividade05.models.Professor;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       
        // instanciar a classe scanner, aluno e professor
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        double x = 0;
        double y = 0;
        double h = 0;
        double r = 0;
        String opcao;

        // entrada de dados
        System.out.println("Informe seu nome:");
        aluno.nome = sc.nextLine();
        System.out.println("Informe sua idade:");
        aluno.idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe seu email:");
        aluno.email = sc.nextLine();

        System.out.println("Nome do aluno: " + aluno.nome);
        System.out.println("Idade do aluno: " + aluno.idade + " anos");
        System.out.println("E-mail do aluno: " + aluno.email);

        professor.nome = "Mário";
        professor.materia = "Matemática";
        professor.matricula = "1234";
        
        System.out.println(professor.apresentar());

        System.out.println("1 - Calcular a area do triângulo");
        System.out.println("2 - Calcular a area do circulo");
        System.out.println("3 - Calcular a equação do 1º grau");

        opcao = sc.nextLine();

        switch (opcao) {
        
            case "1":
                System.out.println("Informe o valor da base: ");
                x = sc.nextDouble();
                System.out.println("Informe o valor da altura:");
                y = sc.nextDouble();
                System.out.println("Area do triângulo: " + professor.areaTriangulo(x, h));
                break;
            
            case "2":
                System.out.println("Informe o valor do raio: ");
                r = sc.nextDouble();
                System.out.println("Informe o valor de b:");
                h = sc.nextDouble ();
                System.out.println("A raiz do circulo é " + professor.areaCirculo(r));
            case "3":
                System.out.println("Informe o valor de a: ");
                y = sc.nextDouble();
                r = sc.nextDouble();
                System.out.println((y != 0) ? "A raiz da equação do 1° grau é " + professor.equacao1Grau(y, r) : "Coeficiente y não pode ser 0.");
                break;
                default: 
                System.out.println("Operação inválida.");
        }




        sc.close();
    }
}
