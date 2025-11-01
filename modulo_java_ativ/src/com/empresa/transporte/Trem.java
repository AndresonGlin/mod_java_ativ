package com.empresa.transporte;

// Implementação Trem (Exemplo com aceleração/freio diferente)
public class Trem implements IMeioTransporte {
    private int velocidade = 0;
    private final int MAX_VELOCIDADE = 100;

    @Override
    public void acelerar() {
        if (velocidade + 5 > MAX_VELOCIDADE) {
            throw new LimiteVelocidadeException("Trem atingiu sua velocidade máxima de " + MAX_VELOCIDADE + " km/h.");
        }
        velocidade += 5; // Acelera em incrementos maiores, mas tem limite menor
        System.out.println("Trem acelerando. Velocidade: " + velocidade);
    }

    @Override
    public void frear() {
        // Trem freia lentamente
        velocidade = Math.max(0, velocidade - 2);
        System.out.println("Trem freando. Velocidade: " + velocidade);
    }

    @Override
    public int getVelocidadeAtual() { return velocidade; }
}
