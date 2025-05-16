import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        double base;
        double altura;
        double area;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        base = entrada.nextDouble();

        System.out.println("Digite o valor da altura: ");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("A área desse triângulo é: %.2f", area);
        entrada.close();
    }
}
