package com.empresa.pagamento;

import java.math.BigDecimal;

// Exceção customizada
class PagamentoInvalidoException extends IllegalArgumentException {
    public PagamentoInvalidoException(String mensagem) {
        super(mensagem);
    }
}

// Classe Abstrata
public abstract class FormaPagamento {
    // A validação é interna e o processamento é a ação
    public abstract void validarPagamento() throws PagamentoInvalidoException;
    public abstract boolean processarPagamento(BigDecimal valor); // Retorna sucesso/falha

    public void exibirRecibo(BigDecimal valor, boolean sucesso) {
        System.out.println("Pagamento de R$ " + valor +
                " via " + this.getClass().getSimpleName() +
                (sucesso ? " PROCESSADO COM SUCESSO." : " FALHOU."));
    }
}

