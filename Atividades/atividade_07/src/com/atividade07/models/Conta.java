package com.atividade07.models;

import com.atividade07.repository.IConta;

public abstract class Conta implements IConta {
    private String agencia;
    private String conta;
    private double saldo;

    public Conta(String agencia, String conta) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0.1;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return this.conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void exibirDados() {
        System.out.println("Número da agência: " +  this.agencia);
        System.out.println("Número da conta: " + this.conta);
        
    }

    @Override
    public double fazerDeposito(double valor) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double fazerSaque(double valor) {
        // TODO Auto-generated method stub
        return 0;
    }

    

}