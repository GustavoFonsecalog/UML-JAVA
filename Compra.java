import java.util.ArrayList;
import java.util.List;

public class Compra {
    private Cliente cliente;
    private String estado;
    private List<Item> itens;
    private Entrega entrega;

    public Compra(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Em Aberto";
        this.itens = new ArrayList<>();
        this.entrega = new Entrega(); // Inicializa a entrega com status "Processando"
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Item> getItens() {
        return itens;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularValor();
        }
        return total;
    }

    public void exibirCompra() {
        System.out.println("=== Dados da Compra ===");
        System.out.println("Estado: " + estado);
        System.out.println("Dados do Cliente:");
        cliente.exibirDados();
        System.out.println("\nItens da Compra:");
        for (Item item : itens) {
            System.out.printf("- Produto: %s | Quantidade: %d | Valor Unitário: %.2f | Subtotal: %.2f%n", 
                item.getProduto().getNome(), item.getQuantidade(), 
                item.getProduto().getPrecoAtual(), item.calcularValor());
        }
        System.out.printf("Valor Total: %.2f%n", calcularTotal());
        System.out.println("\nStatus da Entrega:");
        entrega.exibirStatus();
    }
}
