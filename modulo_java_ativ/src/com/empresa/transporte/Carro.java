package com.empresa.transporte;

// Implementação Carro
public class Carro implements IMeioTransporte {
    private int velocidade = 0;
    private final int MAX_VELOCIDADE = 180;

    @Override
    public void acelerar() {
        if (velocidade + 10 > MAX_VELOCIDADE) {
            throw new LimiteVelocidadeException("Carro atingiu sua velocidade máxima de " + MAX_VELOCIDADE + " km/h.");
        }
        velocidade += 10;
        System.out.println("Carro acelerando. Velocidade: " + velocidade);
    }

    @Override
    public void frear() {
        velocidade = Math.max(0, velocidade - 5);
        System.out.println("Carro freando. Velocidade: " + velocidade);
    }

    @Override
    public int getVelocidadeAtual() { return velocidade; }
}
