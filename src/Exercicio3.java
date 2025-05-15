import java.util.Scanner;

public class
Exercicio3 {
    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        peso = entrada.nextDouble();

        System.out.println("Digite a sua altura: ");
        altura = entrada.nextDouble();

        imc = peso / (Math.pow(altura, 2));
        System.out.printf("O seu IMC (Índice de Massa Corporal) é: %.2f", imc);
        entrada.close();
    }
}
