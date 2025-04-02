import java.util.ArrayList;
import java.util.List;
import metodos_pagamento.Pagamento;

public class Compra {
    private Cliente comprador;
    private String estado;             
    private List<Item> itens;
    private List<Pagamento> pagamentos;   

    public Compra(Cliente comprador) {
        this.comprador = comprador;
        this.estado = "pendente";   
        this.itens = new ArrayList<>();
        this.pagamentos = new ArrayList<>();
    }

    public Cliente getComprador() { return comprador; }
    public void setComprador(Cliente comprador) { this.comprador = comprador; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public List<Item> getItens() { return itens; }
    public List<Pagamento> getPagamentos() { return pagamentos; }

    // Adiciona um item à compra
    public void adicionarItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo.");
        }
        this.itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularValor();
        }
        return total;
    }

    public void finalizarCompra(List<Pagamento> pagamentos) {
        if (itens.isEmpty()) {
            throw new IllegalStateException("Uma compra deve ter pelo menos um item.");
        }
        if (pagamentos == null || pagamentos.isEmpty()) {
            throw new IllegalArgumentException("É necessário definir ao menos um pagamento para finalizar a compra.");
        }
        this.pagamentos = pagamentos;
        this.estado = "confirmada";
    }

    public void exibirCompra() {
        System.out.println("=== Dados da Compra ===");
        System.out.println("Estado: " + estado);
        System.out.println("Dados do Comprador:");
        comprador.exibirDados();
        System.out.println("\nItens da Compra:");
        for (Item item : itens) {
            System.out.printf("- Produto: %s | Quantidade: %d | Valor Unitário: %.2f | Subtotal: %.2f%n",
                              item.getProduto().getNome(), item.getQuantidade(),
                              item.getProduto().getPrecoAtual(), item.calcularValor());
        }
        System.out.printf("Valor Total: %.2f%n", calcularTotal());
        if (!pagamentos.isEmpty()) {
            System.out.println("\nPagamentos:");
            for (Pagamento p : pagamentos) {
                p.processarPagamento(); 
            }
        }
    }
}
