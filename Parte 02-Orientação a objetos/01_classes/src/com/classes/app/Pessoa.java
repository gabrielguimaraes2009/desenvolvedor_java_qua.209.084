package com.classes.app;

public class Pessoa {
    // atributos
    public String nome;
    public String email;
    public int idade;
    public double altura;

    // método
    public void cumprimentar() {
        System.out.println("Olá, boa noite!");

    }
    public void apresentar(){
        System.out.println("Meu nome é " + this.nome + ", meu email é " + this.email + ", tenho " + this.idade + " anos, e " + this.altura + " metros de altura.");
    }

}
