public class Entrega {
    private String status;

    public Entrega() {
        this.status = "Processando";
    }

    public String getStatus() {
        return status;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void exibirStatus() {
        System.out.println("Status da entrega: " + status);
    }
}
