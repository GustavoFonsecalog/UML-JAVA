package metodos_pagamento;

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private int parcelas;

    /**
     * Construtor para pagamento com cartão.
     * @param valor valor total da compra
     * @param numeroCartao número do cartão
     * @param parcelas número de parcelas (deve ser entre 1 e 3)
     */
    public PagamentoCartao(double valor, String numeroCartao, int parcelas) {
        super(valor);
        if (parcelas < 1 || parcelas > 3) {
            throw new IllegalArgumentException("Parcelas deve ser entre 1 e 3.");
        }
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void processarPagamento() {
        double valorParcela = valor / parcelas;
        System.out.println("Processando pagamento com cartão.");
        System.out.println("Número do Cartão: " + numeroCartao);
        System.out.printf("Valor Total: %.2f%n", valor);
        System.out.printf("Parcelado em %dx de: %.2f%n", parcelas, valorParcela);
        System.out.printf("------------------------------\n");
    }
}
