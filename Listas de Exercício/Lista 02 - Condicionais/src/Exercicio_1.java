import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int idade;

        System.out.println("--- Classificação da faixa etária ---");

        // verificação de idade
        while (true) {
            try {
                System.out.print("Informe a idade: ");
                idade = read.nextInt();
                if (idade < 0) {
                    System.out.println("Tente novamente! Insira apenas números positivos (maior ou igual a zero).");
                }
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números. Tente novamente!");
                read.nextLine();   
            }
        }

        // classificação da idade
        if (idade <= 14) {
            System.out.println("Classificação: Criança");
        }
        else if (idade <= 17) {
            System.out.println("Classificação: Adolescente");
        }
        else if (idade <= 30) {
            System.out.println("Classificação: Adulto jovem");
        }
        else {
            System.out.println("Classificação: Adulto");
        }
    }
}