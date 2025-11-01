package com.empresa.pagamento;

import java.math.BigDecimal;

// Implementação Pix
public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        // Simulação de validação: pode ser CPF, email ou telefone (simplificado)
        if (chavePix == null || chavePix.length() < 5) {
            throw new PagamentoInvalidoException("Chave Pix inválida.");
        }
    }

    @Override
    public boolean processarPagamento(BigDecimal valor) {
        try {
            validarPagamento();
            System.out.println("Gerando QR Code Pix para a chave: " + chavePix);
            return true;
        } catch (PagamentoInvalidoException e) {
            System.err.println("Erro de validação do Pix: " + e.getMessage());
            return false;
        }
    }
}
