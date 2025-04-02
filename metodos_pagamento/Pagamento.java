package metodos_pagamento;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do pagamento deve ser maior que zero.");
        }
        this.valor = valor;
    }

    public double getValor() { return valor; }

    public abstract void processarPagamento();
}
