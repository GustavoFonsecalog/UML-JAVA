package metodos_pagamento;

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao(double valor, String numeroCartao, int parcelas) {
        super(valor);
        if (parcelas < 1 || parcelas > 3) {
            throw new IllegalArgumentException("Parcelas devem ser entre 1 e 3.");
        }
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void processarPagamento() {
        double valorParcela = valor / parcelas;
        System.out.println("Pagamento com Cartão (Crédito):");
        System.out.println("Número do Cartão: " + numeroCartao);
        System.out.printf("Valor Total: %.2f%n", valor);
        System.out.printf("Parcelado em %dx de: %.2f%n", parcelas, valorParcela);
    }
}
