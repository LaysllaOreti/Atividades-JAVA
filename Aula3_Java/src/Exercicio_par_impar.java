import java.util.Scanner;

public class Exercicio_par_impar {
    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número para a verificação: ");
        numero = entrada.nextInt();
        if (numero % 2 == 0){
            System.out.printf("O número %d é par!", numero);
        }
        else{
            System.out.printf("O número %d é ímpar!", numero);
        }
        entrada.close();
    }
}
