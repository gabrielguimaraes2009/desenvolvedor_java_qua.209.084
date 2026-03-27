package com.atividade05.models;

public class Professor {
    public String nome;
    public String matricula;
    public String materia;

    public String apresentar(){
        return "Eu sou " + this.nome + " dou aula de " + this.materia + ", minha matrícula é " + this.matricula + ", informe sua duvida para mim solucioná-la";
    }

    public double areaTriangulo(double b, double h) {
        return (b*h)/2;
    }

    public double areaCirculo(double r) {
        return Math.PI*Math.pow(r,2);
    }

    public double equacao1Grau(double a, double b) {
        return -b/a;
    }


}
