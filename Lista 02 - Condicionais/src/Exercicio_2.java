import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        int quantProduto;
        double valorUnitProduto, valorProduto;

        System.out.println("--- Cálculo de compra ---");

        // verifica o valor unitário do produto
        while (true) {
            try {
                System.out.print("Insira o valor unitário do produto: ");
                valorUnitProduto = read.nextDouble();
                if (valorUnitProduto < 0) {
                    System.out.println("Por favor, insira apenas valores positivos (maior ou igual a zero).\n");
                }
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira apenas números.\n");
                read.nextLine();
            }
        }

        // verificar a quantidade de produtos
        while (true) {
            try {
                System.out.print("Insira a quantidade de produto desejada: ");
                quantProduto = read.nextInt();
                if (quantProduto < 0) {
                    System.out.println("Por favor, insira apenas valores positivos (maior ou igual a zero).\n");
                }
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInforme apenas números inteiros. Tente novamente!\n");
                read.nextLine();
            }
        }

        // calcular o valor do produto
        if (quantProduto <= 12) {
            valorProduto = valorUnitProduto * quantProduto;
            System.out.printf("Totaal: %.2f", valorProduto);
        }
        else {
            valorProduto = valorUnitProduto * quantProduto;
            System.out.printf("Desconto igual a: %.2f\n", (valorProduto * 0.1));
            System.out.printf("Total: %.2f", (valorProduto - (valorProduto * 0.1)));
        }
    }
}