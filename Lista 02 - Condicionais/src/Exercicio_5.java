import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Por favor, insira o nome do produto:");
        String nomeProduto = read.nextLine();

        System.out.print("Por favor, insira a quantidade atual em estoque:");
        double quantidadeAtual = read.nextDouble();

        System.out.print("Agora digite a quantidade máxima em estoque:");
        double quantidadeMaxima = read.nextDouble();

        System.out.print("Por último, digite a quantidade mínima em estoque: ");
        double quantidadeMinima = read.nextDouble();

        double quantidadeMedia =((quantidadeMaxima + quantidadeMinima)/ 2);
        String mensagemLoja;

        if (quantidadeAtual >= quantidadeMedia){
            mensagemLoja = "Não realizar a compra de " + nomeProduto;
        }else{
            mensagemLoja = "Realizar a compra" + nomeProduto;
        }

        System.out.printf("Diagnóstico do estoque: %s", mensagemLoja);

        read.close();
    }
}