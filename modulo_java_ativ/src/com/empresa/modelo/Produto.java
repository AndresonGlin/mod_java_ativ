package com.empresa.modelo;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        setNome(nome);
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Validação
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    //Exercicio 2

    class DescontoInvalidoException extends IllegalArgumentException {
        public DescontoInvalidoException(String mensagem) {
            super(mensagem);
        }
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new DescontoInvalidoException(
                    "Porcentagem de desconto inválida. Deve estar entre 0 e 50 (inclusive)."
            );
        }

        double fatorDesconto = 1 - (porcentagem / 100.0);
        setPreco(this.preco * fatorDesconto);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Laptop", 1500.00, 10);
        System.out.println("Preço original: " + produto.getPreco()); // 1500.0

        try {
            produto.aplicarDesconto(10.0); // Desconto válido
            System.out.println("Preço com 10% de desconto: " + produto.getPreco()); // 1350.0

            // Tentativa de atribuição inválida
            produto.aplicarDesconto(60.0);
        } catch (DescontoInvalidoException e) {
            System.err.println("Erro ao aplicar desconto: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro de validação: " + e.getMessage());
        }
    }
}