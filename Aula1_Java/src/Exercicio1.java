import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        double tempF;
        double tempC;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira uma temperatura em Fahrenheit para realizar a conversão em Celsius: ");
        tempF = entrada.nextDouble();

        tempC = (tempF - 32 ) * 5/9;

        System.out.printf("A temperatura convertida para Celsius será: %.2f", tempC);
        entrada.close();
    }
}
