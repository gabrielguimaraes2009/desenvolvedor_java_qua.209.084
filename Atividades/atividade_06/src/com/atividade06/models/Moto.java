package com.atividade06.models;

final public class Moto extends Veiculo {
    // atributo
    private String cilindradas;

    // construtor
    public Moto(String cilindradas, String fabricante, String modelo, String ano, String cor, String categoria, String placa) {
        super(fabricante, modelo, ano, cor, placa, categoria);
        this.cilindradas = cilindradas;
    }
    // getters e setters
    public String getCilindradas() {
        return this.cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }


    


}
