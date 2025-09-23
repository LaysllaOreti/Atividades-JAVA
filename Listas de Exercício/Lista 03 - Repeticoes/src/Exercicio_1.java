import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Utilizo uma lista
        int[] numeros = new int[10];
        int pares = 0, impares = 0, negativos = 0, positivos = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = read.nextInt();
        }

        // verificar se são ímpares/pares e positivoes/negativos
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numero < 0) {
                negativos++;
            } else if (numero > 0) {
                positivos++;
            }
        }

        int opcao;
        do {
            System.out.println("\nO que você deseja saber? ");
            System.out.println("a. Quantos números pares?");
            System.out.println("b. Quantos números ímpares?");
            System.out.println("c. Quantos negativos?");
            System.out.println("d. Quantos positivos?");
            System.out.println("e. Sair do programa");
            System.out.print("Escolha uma número referente a opção desejada: ");
            char escolha = read.next().charAt(0);

            switch (escolha) {
                case 'a':
                    System.out.println("A quantidade de números pares é: " + pares);
                    break;
                case 'b':
                    System.out.println("A quantidade de números ímpares é: " + impares);
                    break;
                case 'c':
                    System.out.println("A quantidade de números negativos é: " + negativos);
                    break;
                case 'd':
                    System.out.println("A quantidade de números positivos é: " + positivos);
                    break;
                case 'e':
                    System.out.println("Saindo do programa...Tchau tchau");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, insira uma opção correspondente à aquela que deseja");
            }
        } while (true);
    }
}