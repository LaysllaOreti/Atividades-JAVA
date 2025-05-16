import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        double tempC;
        double tempF;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira uma temperatura em Celsius para realizar a conversão em Fahrenheit: ");
        tempC = entrada.nextDouble();

        tempF = (tempC * 9/5 ) + 32;

        System.out.printf("A temperatura convertida para Celsius será: %.2f", tempF);
        entrada.close();
    }
}
