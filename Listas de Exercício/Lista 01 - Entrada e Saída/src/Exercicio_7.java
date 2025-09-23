import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario_base = 1500.00;
        double comissao_por_carro = 350.00;
        double porcentagem_loja = 0.00001;

        System.out.println("Digite o seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Insira o mês atual:");
        String mes = entrada.nextLine();

        System.out.println("Digite a quantidade de carros que você vendeu:");
        int qnt_carros = entrada.nextInt();

        System.out.println("Digite o valor total das vendas:");
        double valor_total = entrada.nextDouble();

        // cálculo do salário final
        double salario_final = salario_base + (comissao_por_carro * qnt_carros) + (valor_total * porcentagem_loja);

        // imprimindo todos os resultados
        System.out.println("======Visão geral do mês======");
        System.out.printf("Vendedor: %s%n", nome);
        System.out.printf("Mês: %s%n", mes);
        System.out.printf("Quantidade de carros vendidos: %d%n", qnt_carros);
        System.out.printf("Valor total das vendas: R$ %.2f%n", valor_total);
        System.out.printf("Salário final: R$ %.2f%n", salario_final);

        // fechando o Scanner
        entrada.close();
    }
}
