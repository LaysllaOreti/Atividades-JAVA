import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio {

    //O programa só aceita números e esses números devem ser maior ou igual a 20
    //caso forem menores ou forem outros tipos de texto, o programa pede para digitar novamente.
    //O programa só vai encerrar quando atender os critérios acima
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        //while true é um laço infinito
        while (true) {
            try {
                System.out.println("Digite um número: ");
                numero = scanner.nextInt();
 
                if (numero < 20) { //Verifico se o número é maior que 20
                    System.out.println("O número que você digitou é menor que 20!");
                    continue; //o continue tem a função de reiniciar o laço
                }
                break; //Aqui o código está correto e é encerrado
            } catch (InputMismatchException e) { //Verifico se foi digitado dados inválidos (letras ou caracteres especiais)
                System.out.println("Você digitou caracteres inválidos. Por fvor, digite apenas números: ");
            }
            scanner.nextLine();
        }
        System.out.println(numero);
    }

}
