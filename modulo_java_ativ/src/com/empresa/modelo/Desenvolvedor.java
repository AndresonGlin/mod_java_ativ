package com.empresa.modelo;

import java.math.BigDecimal;

// Classe Desenvolvedor
public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal calcularBonus() {
        // Bônus de 10% (0.10)
        return this.salario.multiply(new BigDecimal("0.10"));
    }
}
