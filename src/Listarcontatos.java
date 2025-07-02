public class Listarcontatos {
    private String nome;
    private String numero;

    public Listarcontatos(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static void testar_metodo() {
        System.out.println("Funciona!");
    }

    public void testar_obj() {
        System.out.println("Funciona com obj!");
    }

}
