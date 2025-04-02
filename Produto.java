public class Produto {
    private String nome;
    private String descricao;
    private double precoAtual;
    private int quantidadeEstoque;

    public Produto(String nome, String descricao, double precoAtual, int quantidadeEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoAtual = precoAtual;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(double precoAtual) {
        this.precoAtual = precoAtual;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void mudarPreco(double novoPreco) {
        this.precoAtual = novoPreco;
    }

    public void mudarQuantidadeEstoque(int novaQuantidade) {
        this.quantidadeEstoque = novaQuantidade;
    }
}
