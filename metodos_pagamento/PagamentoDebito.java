package metodos_pagamento;

public class PagamentoDebito extends Pagamento {
    private String numeroConta;

    public PagamentoDebito(double valor, String numeroConta) {
        super(valor);
        this.numeroConta = numeroConta;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Débito:");
        System.out.println("Número da Conta: " + numeroConta);
        System.out.printf("Valor Total: %.2f%n", valor);
    }
}
