package com.empresa.transporte;

import java.util.ArrayList;
import java.util.List;

// Demonstração
public class TesteMeiosTransporte {
    public static void main(String[] args) {
        List<IMeioTransporte> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Bicicleta());
        veiculos.add(new Trem());

        for (IMeioTransporte veiculo : veiculos) {
            System.out.println("\n--- Operando " + veiculo.getClass().getSimpleName() + " ---");
            try {
                veiculo.acelerar();
                veiculo.acelerar();
                veiculo.frear();
            } catch (LimiteVelocidadeException e) {
                System.err.println("Erro: " + e.getMessage());
            }
        }
    }
}
