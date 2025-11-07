public class Circulo {
    // variáveis dinâmicas
    String cor;
    double raio;
    // variável estática
    static final double PI = Math.PI;
    //static double pi = 3.14;

    public Circulo(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    double calcularArea(){
        return PI * this.raio * this.raio;
    }
}
