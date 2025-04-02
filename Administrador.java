public class Administrador implements Observador {
    private String nome;

    public Administrador(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Administrador " + nome + " recebeu notificação: " + mensagem);
    }
}
