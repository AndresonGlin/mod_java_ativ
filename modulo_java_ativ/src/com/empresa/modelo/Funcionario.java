package com.empresa.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


// Classe Base
public abstract class Funcionario {
    protected String nome;
    protected BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        if (salario == null || salario.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Salário deve ser positivo.");
        }
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public BigDecimal getSalario() { return salario; }

    //Metodo Abstrato
    public abstract BigDecimal calcularBonus();
}

