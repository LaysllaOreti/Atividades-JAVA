import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int otimo = 0;
        int bom = 0;
        int ruim = 0;
        int totalRespostas = 0;
        double somaNotas = 0;
        char continuar;

        do {
            System.out.println("\nQual é a sua opinião sobre o filme?");
            System.out.println("1 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("3 - Ruim");
            System.out.print("Sua resposta: ");
            int opiniao = read.nextInt();

            switch (opiniao) {
                case 1:
                    otimo++;
                    break;
                case 2:
                    bom++;
                    break;
                case 3:
                    ruim++;
                    break;
                default:
                    System.out.println("Essa opção é inválida!!!");
            }

            if (opiniao >= 1 && opiniao <= 3) {
                totalRespostas++;
                somaNotas += opiniao;
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = read.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("\nVeja abaixo o resultado:");
        if (totalRespostas > 0) {
            System.out.println("a. Quantos responderam 'Ótimo': " + otimo);
            System.out.printf("Isso representa %.2f%% do total de respondentes.\n", (otimo * 100.0 / totalRespostas));

            System.out.println("b. Quantos responderam 'Bom': " + bom);
            System.out.printf("Isso representa %.2f%% do total de respondentes.\n", (bom * 100.0 / totalRespostas));

            System.out.println("c. Quantos responderam 'Ruim': " + ruim);
            System.out.printf("Isso representa %.2f%% do total de respondentes.\n", (ruim * 100.0 / totalRespostas));

            System.out.println("d. Quantas pessoas ao todo responderam: " + totalRespostas);

            double media = somaNotas / totalRespostas;
            System.out.printf("e. Média de notas do filme: %.2f\n", media);
        } else {
            System.out.println("Nenhuma resposta válida foi registrada.");
        }

        read.close();
    }
}
