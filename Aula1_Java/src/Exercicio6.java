import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double delta;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        a = entrada.nextDouble();

        System.out.println("Digite o valor de B: ");
        b = entrada.nextDouble();

        System.out.println("Digite o valor de C: ");
        c = entrada.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c; //cálculo do delta

        System.out.printf("O valor de delta é: %.2f", delta);
        entrada.close();
    }
}
