public class Produto {
    private final String nome;        
    private final String descricao; 
    private double precoAtual;
    private int quantidadeEstoque;

    public Produto(String nome, String descricao, double precoAtual, int quantidadeEstoque) {
        if (precoAtual <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade em estoque não pode ser negativa.");
        }
        this.nome = nome;
        this.descricao = descricao;
        this.precoAtual = precoAtual;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }

    public double getPrecoAtual() { return precoAtual; }
    public void setPrecoAtual(double precoAtual) {
        if (precoAtual <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }
        this.precoAtual = precoAtual;
    }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
