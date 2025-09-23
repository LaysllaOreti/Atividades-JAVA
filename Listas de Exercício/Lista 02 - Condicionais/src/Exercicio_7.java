import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        try {
            System.out.println("--- Quiz sobre Fórmula 1");
            System.out.println("Escolha o tema do Quiz:");
            System.out.println("1 - Pilotos de F1");
            System.out.println("2 - História da F1");

            int escolha = leia.nextInt();

            if (escolha == 1) {
                // primeira pergunta - pilotos de F1
                System.out.println("\nQual piloto tem mais títulos mundiais de F1?");
                System.out.println("1. Michael Schumacher");
                System.out.println("2. Lewis Hamilton");
                System.out.println("3. Ayrton Senna");
                int resposta1 = leia.nextInt();

                if (resposta1 == 1 || resposta1 == 2) {
                    System.out.println("Você acertou!Schumacher e Hamilton têm 7 títulos cada.");
                } else {
                    System.out.println("Você errou!A resposta certa seria Schumacher ou Hamilton.");
                }

            } else if (escolha == 2) {
                // Primeira pergunta - pilotos
                System.out.println("\nQuem foi o primeiro campeão mundial da Fórmula 1?");
                System.out.println("1. Nino Farina");
                System.out.println("2. Juan Manuel Fangio");
                System.out.println("3. Alberto Ascari");
                int resposta1 = leia.nextInt();

                if (resposta1 == 1) {
                    System.out.println("Você acertou! Giuseppe 'Nino' Farina venceu em 1950.");
                } else {
                    System.out.println("Você errou! O certo é Nino Farina (1950).");
                }
            }

            // Segunda pergunta - história da F1
            System.out.println("\nEm que ano ocorreu a primeira temporada oficial da Fórmula 1?");
            System.out.println("1. 1946");
            System.out.println("2. 1950");
            System.out.println("3. 1960");
            int resposta2 = leia.nextInt();

            if (resposta2 == 2) {
                System.out.println("Resposta certa! 1950 foi a primeira temporada oficial.");
            } else {
                System.out.println("Errado! A resposta correta é 1950.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um número válido!");
        } finally {
            leia.close();
        }
    }
}
