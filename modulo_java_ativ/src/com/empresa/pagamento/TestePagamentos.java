package com.empresa.pagamento;

import java.math.BigDecimal;

// Demonstração (Polimorfismo)
public class TestePagamentos {
    public static void main(String[] args) {
        BigDecimal valorCompra = new BigDecimal("55.90");

        FormaPagamento cartaoValido = new CartaoCredito("1234567890123456");
        FormaPagamento cartaoInvalido = new CartaoCredito("123");
        FormaPagamento pix = new Pix("meu.email@teste.com");

        boolean sucesso1 = cartaoValido.processarPagamento(valorCompra);
        cartaoValido.exibirRecibo(valorCompra, sucesso1);

        System.out.println("---");
        boolean sucesso2 = cartaoInvalido.processarPagamento(valorCompra);
        cartaoInvalido.exibirRecibo(valorCompra, sucesso2);

        System.out.println("---");
        boolean sucesso3 = pix.processarPagamento(valorCompra);
        pix.exibirRecibo(valorCompra, sucesso3);
    }
}
