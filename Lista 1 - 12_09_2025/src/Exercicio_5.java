import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qnt_horas;
        int qnt_minutos;
        int qnt_segundos;

        // inserir as horas
        do {
            System.out.println("Digite a quantidade de horas (0 a 23): ");
            qnt_horas = entrada.nextInt();
            if (qnt_horas < 0 || qnt_horas > 23) {
                System.out.println("Valor inválido! Digite a quantidade de horas entre 0 e 23");
            }
        } while (qnt_horas < 0 || qnt_horas > 23);

        // inserir os minutos
        do {
            System.out.println("Digite a quantidade de minutos (0 a 59): ");
            qnt_minutos = entrada.nextInt();
            if (qnt_minutos < 0 || qnt_minutos > 59) {
                System.out.println("Valor inválido! Digite a quantidade de minutos entre 0 e 59.");
            }
        } while (qnt_minutos < 0 || qnt_minutos > 59);

        // inserir os segundos
        do {
            System.out.println("Digite a quantidade de segundos (0 a 59): ");
            qnt_segundos = entrada.nextInt();
            if (qnt_segundos < 0 || qnt_segundos > 59) {
                System.out.println("Valor inválido! Digite a quantidade de segundos entre 0 a 59");
            }
        } while (qnt_segundos < 0 || qnt_segundos > 59);

        // convertendo para segundos
        int total_segundos = qnt_horas * 3600 + qnt_minutos * 60 + qnt_segundos;

        System.out.printf("O horário que foi digitado, convertido em segundos é igual a: %d%n", total_segundos);

        entrada.close();
    }
}
