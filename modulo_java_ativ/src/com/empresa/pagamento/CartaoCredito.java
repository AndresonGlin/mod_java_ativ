package com.empresa.pagamento;

import java.math.BigDecimal;

// Implementação CartaoCredito
public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        // Simulação de validação: 16 dígitos
        if (numeroCartao == null || !numeroCartao.matches("\\d{16}")) {
            throw new PagamentoInvalidoException("Número de cartão de crédito inválido. Esperado 16 dígitos.");
        }
    }

    @Override
    public boolean processarPagamento(BigDecimal valor) {
        try {
            validarPagamento();
            // Simula processamento em um gateway
            System.out.println("Processando R$ " + valor + " no Cartão ****" + numeroCartao.substring(12) + "...");
            return true;
        } catch (PagamentoInvalidoException e) {
            System.err.println("Erro de validação do Cartão: " + e.getMessage());
            return false;
        }
    }
}
