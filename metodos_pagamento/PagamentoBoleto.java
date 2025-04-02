package metodos_pagamento;

public class PagamentoBoleto extends Pagamento {
    private String codigoBoleto;

    public PagamentoBoleto(double valor, String codigoBoleto) {
        super(valor);
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void processarPagamento() {
        double valorComDesconto = valor * 0.95; // desconto de 5%
        System.out.println("Processando pagamento via boleto.");
        System.out.println("Código do Boleto: " + codigoBoleto);
        System.out.printf("Valor Original: %.2f%n", valor);
        System.out.printf("Valor com Desconto de 5%%: %.2f%n", valorComDesconto);
        System.out.printf("------------------------------\n");
    }
}
