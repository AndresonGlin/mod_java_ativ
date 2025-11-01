package com.empresa.transporte;

// Implementação Bicicleta
public class Bicicleta implements IMeioTransporte {
    private int velocidade = 0;
    private final int MAX_VELOCIDADE = 40;

    @Override
    public void acelerar() {
        if (velocidade + 2 > MAX_VELOCIDADE) {
            throw new LimiteVelocidadeException("Bicicleta atingiu sua velocidade máxima de " + MAX_VELOCIDADE + " km/h.");
        }
        velocidade += 2;
        System.out.println("Bicicleta acelerando. Velocidade: " + velocidade);
    }

    @Override
    public void frear() {
        // Freio mais rápido que o carro
        velocidade = Math.max(0, velocidade - 5);
        System.out.println("Bicicleta freando. Velocidade: " + velocidade);
    }

    @Override
    public int getVelocidadeAtual() { return velocidade; }
}
