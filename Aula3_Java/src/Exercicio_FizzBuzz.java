import java.util.Scanner;

public class Exercicio_FizzBuzz {
    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0 && numero % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (numero % 2 == 0) {
            System.out.println("Fizz");
        } else if (numero % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Erro!");
        }
        entrada.close();
    }
}
