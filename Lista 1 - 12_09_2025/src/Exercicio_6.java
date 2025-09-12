import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double peso1 = 0.40;

        double peso2 = 0.60;

        System.out.println("Digite a primeira nota: ");
        double nota1 = read.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = read.nextDouble();

        //calcular a média ponderada
        double soma_notas = (nota1 + peso1) + (nota2 + peso2);
        double soma_pesos = peso1 + peso2;

        //calcular a média ponderada
        double media_ponderada = soma_notas / soma_pesos;

        System.out.printf("A média ponderada dessas notas é igual a: %.2f%n", media_ponderada);

        // fechar o Scanner
        read.close();
    }
}
