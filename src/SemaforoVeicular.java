public class SemaforoVeicular extends Semaforo {
    public SemaforoVeicular(String cor, String nome) {
        super(cor, nome);
        status();
    }
    @Override  
    public void mudarCor() {
        switch (this.cor) {
            case "Vermelho":
                this.cor = "Verde";
                break;
            case "Verde":
                this.cor = "Amarelo";
                break;
            case "Amarelo":
                this.cor = "Vermelho";
                break;
        }
        status();
    }
}