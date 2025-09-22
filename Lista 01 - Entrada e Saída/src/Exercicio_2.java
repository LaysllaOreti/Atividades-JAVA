import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n===== Operações matemáticas =====");

        // entrada dos dois números
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();

        // operação de soma
        int soma = num1 + num2;

        // operação de subtração
        int subtracao = num1 - num2;

        // operação de multiplicação
        int multiplicacao = num1 * num2;

        // operação de divisão (verificando divisão por zero)
        double divisao;
        if (num2 != 0) {
            divisao = (double) num1 / num2;
        } else {
            divisao = Double.NaN;
        }

        // operação de potencicação (math.pow)
        double potencia = Math.pow(num1, num2);

        // operação do resto da divisão
        int resto = num2 != 0 ? num1 % num2 : 0;

        // imprimir o resultado
        System.out.println("\n===== Resultados =====");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        if (num2 != 0) {
            System.out.println("Divisão: " + divisao);
            System.out.println("Resto da divisão: " + resto);
        } else {
            System.out.println("Divisão: A divisão não poderá ser realizada");
            System.out.println("Resto da divisão: A divisão não possui resto, pois o segundo número é zero");
        }
        System.out.println("Potência: " + potencia);

        // fechar o Scanner
        entrada.close();
    }
}
