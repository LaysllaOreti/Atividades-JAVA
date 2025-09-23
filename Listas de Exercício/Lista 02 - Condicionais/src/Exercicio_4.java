import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        final double valorBase = 3000.00;
        double valorFinal = 0.0;

        System.out.print("Insira o lugar onde deseja passar as suas férias: \n1 - Maceió \n2- Porto de Galinhas\n ");
        int escolherDestino = read.nextInt();


        int escolherCardapio;

        if (escolherDestino == 1) {
            // se o destino for Maceió
            System.out.println("Deseja ter refeição (almoço/jantar) incluso? \n1- Sim \n2- Não ");
            escolherCardapio = read.nextInt();

            if (escolherCardapio == 1) {
                // se o destino for Maceió com refeição inclusa
                valorFinal = valorBase + (valorBase * 1.00);
            } else if (escolherCardapio == 2) {
                // se o destino for Maceió sem refeição inclusa
                valorFinal = valorBase + (valorBase * 0.85);
            } else {
                System.out.println("Por favor, insira uma opção de cardápio válida.");
            }

        } else if (escolherDestino == 2) {
            // se o destino for Porto de Galinhas
            System.out.print("Deseja ter refeição (almoço/jantar) incluso? \n1- Sim \n2- Não ");
            escolherCardapio = read.nextInt();

            if (escolherCardapio == 1) {
                // se o destino for Porto de Galinhas com refeição inclusa
                valorFinal = valorBase + (valorBase * 0.60);
            } else if (escolherCardapio == 2) {
                // se o destino for Porto de Galinhas sem refeição inclusa
                valorFinal = valorBase + (valorBase * 0.45);
            } else {
                System.out.println("Opção de cardápio inválida.");
            }

        } else {
            System.out.print("Por favor, escolha um dos destinos disponíveis!");
        }


        if (valorFinal > 0) {
            System.out.printf("O valor final da sua viagem é: R$ %.2f\n", valorFinal);
        }

        read.close();
    }
}