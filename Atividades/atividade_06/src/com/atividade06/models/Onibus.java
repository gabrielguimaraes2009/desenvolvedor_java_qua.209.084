package com.atividade06.models;

final public class Onibus extends Veiculo {

    // atributo
    private boolean leito;

    // construtor
    public Onibus(boolean leito, String fabricante, String modelo, String ano, String cor, String placa, String categoria) {
        super(fabricante, modelo, ano, cor, placa, categoria);
        this.leito = leito;
    }
    
    // getters e setters
    public boolean isLeito() {
        return this.leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }

}
