package com.empresa.modelo;

import java.math.BigDecimal;

// Classe Gerente
public class Gerente extends Funcionario {
    public Gerente(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal calcularBonus() {
        // Bônus de 20% (0.20)
        return this.salario.multiply(new BigDecimal("0.20"));
    }
}
