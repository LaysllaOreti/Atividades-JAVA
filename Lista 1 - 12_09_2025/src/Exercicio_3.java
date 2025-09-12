import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // usuário informa o valor da compra
        System.out.print("Informe o valor de  em reais: R$ ");
        double valor_compra = read.nextDouble();

        // calcular 20% do representante e 30% doa impostos
        double valor_representante = valor_compra * 0.20;
        double valor_impostos = valor_compra * 0.30;

        // cálculo do valor da venda
        double valor_venda = valor_compra + valor_representante + valor_impostos;

        // imprimir todos os valores
        System.out.println("\nValor da compra: R$ " + String.format("%.2f", valor_compra));
        System.out.println("Valor do representante (Taxa de 20%): R$ " + String.format("%.2f", valor_representante));
        System.out.println("Valor dos impostos (Taxa de 30%): R$ " + String.format("%.2f", valor_impostos));
        System.out.println("Valor da venda: R$ " + String.format("%.2f", valor_venda));

        // fechar o Scanner
        read.close();
    }
}
