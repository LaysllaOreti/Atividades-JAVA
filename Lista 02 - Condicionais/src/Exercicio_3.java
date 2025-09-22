import java.sql.Time;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int time1, time2;

        System.out.println("--- Verificação do placar de um jogo ---");

        // verificar gols do time 1
        while (true) {
            try {
                System.out.print("Gols do time 1: ");
                time1 = read.nextInt();
                if (time1 < 0) {
                    System.out.println("Por favor, insira apenas números positivos (maior ou igual a zero).\n");
                }
                else {
                    break;
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Por favor, insira apenas números inteiros. Tente novamente\n");
                read.nextLine();
            }
        }

        // verificação dos gols do time 2
        while (true) {
            try {
                System.out.print("Gols do time 2: ");
                time2 = read.nextInt();
                if (time2 < 0) {
                    System.out.println("Por favor, insira apenas números positivos (maior ou igual a zero).\n");
                }
                else {
                    break;
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Por favor, insira apenas números inteiros. Tente novamente.\n");
                read.nextLine();
            }
        }

        // calcular o ganhador
        if (time1 > time2) {
            System.out.printf("\n--- Placar final ---\n  Gols time 1: %d\n  Gols time 2: %d\n!!!! Vencedor !!!!: Time 1 *", time1, time2);
        }
        else if (time1 == time2) {
            System.out.printf("\n--- Placar final ---\n  Gols time 1: %d\n  Gols time 2: %d\n* Empate * - Não houve vencedor *", time1, time2);
        }
        else {
            System.out.printf("\n--- Placar final ---\n  Gols time 1: %d\n  Gols time 2: %d\n!!!! Vencedor !!!!: Time 2 *", time1, time2);
        }
    }
}