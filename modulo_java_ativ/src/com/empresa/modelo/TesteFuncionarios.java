package com.empresa.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// Demonstração (classe separada)
public class TesteFuncionarios {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Ana Silva", new BigDecimal("10000.00")));
        funcionarios.add(new Desenvolvedor("Beto Costa", new BigDecimal("5000.00")));
        funcionarios.add(new Gerente("Carla Rocha", new BigDecimal("12500.00")));

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() +
                    " (" + f.getClass().getSimpleName() + "): " +
                    "Bônus = R$ " + f.calcularBonus());
        }
    }
}
