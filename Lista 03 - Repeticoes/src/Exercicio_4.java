import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira um número:");
        int numero = read.nextInt();

        System.out.println("Por favor, insira um valor a ser incrementado:");
        int incremento = read.nextInt();

        for (int i = 0; i <= numero; i += incremento){
            System.out.print(i);
            if (i < numero){
                // aqui será a saída do incremento
                System.out.print(", ");
            }
        }
        read.close();
    }
}