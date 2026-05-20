package com.crud.javalanches.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Cliente {
    // atributos
    private int codigo_cliente;
    private String email;
    private String nome;
    private String telefone;
    private String cpf;
    private LocalDate dataNascimento;
}
