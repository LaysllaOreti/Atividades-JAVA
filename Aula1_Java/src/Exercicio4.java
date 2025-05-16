import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        double numero;
        double quadrado;
        double cubo;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = entrada.nextDouble();

        quadrado = Math.pow(numero, 2);
        System.out.printf("O quadrado desse número é: %.2f", quadrado);

        cubo = Math.pow(numero, 3);
        System.out.printf("\nO cubo desse número é: %.2f", cubo);

        entrada.close();
    }
}
