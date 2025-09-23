import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double saldo;
        int totalPessoas = 0;
        int saldoPositivo = 0;
        int saldoNegativo = 0;
        char continuar;

        // fará isso enquanto a condição for verdadeira
        do {
            System.out.print("Informe o saldo da pessoa: ");
            saldo = read.nextDouble();
            totalPessoas++;

            if (saldo >= 0) {
                saldoPositivo++;
            } else {
                saldoNegativo++;
            }

            // pergunta ao usuário se ele deseja continuar
            System.out.print("Deseja continuar informando saldos? (S/N): ");
            continuar = read.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("\n--- Visão geral dos Saldos");

        if (totalPessoas > 0) {
            System.out.println("Pessoas quem possuem saldo positivo: " + saldoPositivo);
            System.out.println("Pessoas que possuem saldo negativo: " + saldoNegativo);

            double percentualPositivo = (double) saldoPositivo / totalPessoas * 100;
            double percentualNegativo = (double) saldoNegativo / totalPessoas * 100;

            System.out.printf("Percentual de positivos: %.2f%%\n", percentualPositivo);
            System.out.printf("Percentual de negativos: %.2f%%\n", percentualNegativo);

            if (percentualPositivo >= 50) {
                System.out.println("Nenhum risco ao banco!");
            } else {
                System.out.println("Cuidado, possui risco ao banco!");
            }
        } else {
            System.out.println("Nenhum dado foi informado!");
        }

        read.close();
    }
}
