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

        double x;
        double y;
        double h;

        // entrada de dados
        System.out.println("Informe seu nome:");
        aluno.nome = sc.nextLine();
        System.out.println("Informe sua idade:");
        aluno.idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe seu email:");
        aluno.email = sc.nextLine();

        professor.nome = "Mário";
        professor.materia = "Matemática";
        professor.matricula = "1234";
        
        System.out.println(professor.apresentar());

        
 
    }
}
