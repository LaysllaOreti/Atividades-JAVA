import java.util.Random;
import java.util.Scanner;

public class Exercicio_6{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        // gerar um número aleatório entre 1 e 100
        int numeroSorteado = random.nextInt(100) + 1;
        int tentativasRestantes = 3;
        boolean acertou = false;

        System.out.println("Tente advinhar o número da sorte, ele pode estar entre 1 e 100!");

        // loop que dá 3 chances para o usuário
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Tentativa %d de %d. Digite um número: ", i, tentativasRestantes);
            int palpite = read.nextInt();

            if (palpite == numeroSorteado) {
                acertou = true;
                break; //Sai o loop se o usuário acertar
            } else {
                System.out.println("Infelizmente você errou. Tente novamente!");
            }
        }

        if (acertou) {
            System.out.println("Parabéns!!! Você acertou o número.");
        } else {
            System.out.printf("Ifelizmente você errou. O número que foi sorteado era: %d", numeroSorteado);
        }

        read.close();
    }
}