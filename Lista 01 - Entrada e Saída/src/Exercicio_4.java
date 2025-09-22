import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num_inteiro = read.nextInt();

        int num_antecessor = num_inteiro - 1;
        int num_sucessor = num_inteiro + 1;

        System.out.printf(
                "'O número informado foi %d, o antecessor é %d e o sucessor é %d.'",
                num_inteiro, num_antecessor, num_sucessor
        );
    }
}
