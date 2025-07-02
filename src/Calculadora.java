public class Calculadora {
    public static double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public static double soma(double a,double b) {
        return a + b;
    }
    public static double subtracao(double a,double b) {
        return a - b;
    }
    public static double multiplicacao(double a,double b) {
        return a * b;
    }
    public static double divisao(double a,double b) {
        if (b != 0){
            return a / b; 
        } else{
            System.out.println("Operação Invalida!");
            return 0;
        }   
    }
    public static void main(String[] args) {
        //double resultado = calcularArea(5,3);
        double divisao = divisao(5,0);
        System.out.println(divisao);
    }
}