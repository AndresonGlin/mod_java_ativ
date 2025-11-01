package com.empresa.transporte;

import java.util.ArrayList;
import java.util.List;

public interface IMeioTransporte {
    void acelerar();
    void frear();
    int getVelocidadeAtual();
}

// Exceção
class LimiteVelocidadeException extends IllegalStateException {
    public LimiteVelocidadeException(String mensagem) {
        super(mensagem);
    }
}

