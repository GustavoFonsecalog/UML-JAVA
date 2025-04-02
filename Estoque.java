import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Observador> observadores = new ArrayList<>();
    private Produto produto;

    public Estoque(Produto produto) {
        this.produto = produto;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void atualizarEstoque(int novaQuantidade) {
        produto.setQuantidadeEstoque(novaQuantidade);
        if (novaQuantidade < 5) {
            notificarObservadores("Estoque baixo para o produto: " + produto.getNome());
        }
    }

    private void notificarObservadores(String mensagem) {
        for (Observador obs : observadores) {
            obs.atualizar(mensagem);
        }
    }
}
