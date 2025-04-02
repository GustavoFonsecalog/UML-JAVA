import metodos_pagamento.Pagamento;
import metodos_pagamento.PagamentoCartao;
import metodos_pagamento.PagamentoBoleto;
import metodos_pagamento.PagamentoDebito;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", "123.456.789-00", "Rua A, 123", "(11) 98765-4321");
        
        Produto produto1 = new Produto("Notebook", "Notebook 15 polegadas", 2500.00, 10);
        Produto produto2 = new Produto("Smartphone", "Smartphone Android", 1500.00, 20);
        
        Item item1 = new Item(produto1, 1);
        Item item2 = new Item(produto2, 2);
        
        Compra compra = new Compra(cliente);
        compra.adicionarItem(item1);
        compra.adicionarItem(item2);
        
        Estoque estoque = new Estoque(produto1);
        Administrador admin = new Administrador("Carlos");
        estoque.adicionarObservador(admin);
        estoque.atualizarEstoque(3);
        
        compra.exibirCompra();
        
        double totalCompra = compra.calcularTotal();
        System.out.println("\n--- Processamento de Pagamentos ---");
        
        Pagamento pagamentoCartao = new PagamentoCartao(totalCompra, "1234-5678-9012-3456", 3);
        pagamentoCartao.processarPagamento();
        
        Pagamento pagamentoBoleto = new PagamentoBoleto(totalCompra, "BOLETO123456");
        pagamentoBoleto.processarPagamento();
        
        Pagamento pagamentoDebito = new PagamentoDebito(totalCompra, "CONTA-987654321");
        pagamentoDebito.processarPagamento();
    }
}
