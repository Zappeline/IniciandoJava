public class App {
    public static void main(String[] args) {
        Listarcontatos lista = new Listarcontatos("Lucas", "999999999");
        System.out.println("O nome é: " + lista.getNome());

        Listarcontatos.testar_metodo();
    }
}
