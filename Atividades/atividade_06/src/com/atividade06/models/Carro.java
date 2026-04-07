package com.atividade06.models;

final public class Carro extends Veiculo{

    // atributo
    private boolean bagageiro;

    // construtor
    public Carro(boolean bagageiro, String fabricante, String modelo, String ano, String cor, String placa, String categoria) {
        super(fabricante, modelo, ano, cor, placa, categoria);
        this.bagageiro = bagageiro;

    }
    public boolean isBagageiro() {
        return this.bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

}



   