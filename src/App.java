public class App {
    public static void main(String[] args) throws Exception {
        SemaforoVeicular A = new SemaforoVeicular("Vermelho", "A");
        SemaforoVeicular B = new SemaforoVeicular("Vermelho", "B");

        while (true) {
            A.esperar(4);
            B.mudarCor(); //Verde
            A.status();
            B.esperar(3);
            B.mudarCor(); //Amarelo
            A.status();
            B.esperar(1);
            B.mudarCor(); //Vermelho
            B.esperar(4);
            A.mudarCor(); //verde
            A.esperar(3);
            A.mudarCor(); //amarelo
            A.esperar(1);
            A.mudarCor(); //vermelho
        }
    }
}