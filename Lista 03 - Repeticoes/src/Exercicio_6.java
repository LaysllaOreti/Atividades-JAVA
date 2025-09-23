import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Você deseja cadastrar quantas pessoas? ");
        int totalPessoas = lerInteiroPositivo(read);

        String nomeMaisPesado = "";
        double pesoMaisPesado = -1;

        String nomeMaisAlto = "";
        double alturaMaisAlta = -1;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\n=== Pessoa " + i + " ===");

            System.out.print("Insira o nome: ");
            String nome = read.nextLine();

            System.out.print("Insira a altura (em metros): ");
            double altura = lerDoublePositivo(read);

            System.out.print("Insira o peso (em kg): ");
            double peso = lerDoublePositivo(read);

            if (peso > pesoMaisPesado) {
                pesoMaisPesado = peso;
                nomeMaisPesado = nome;
            }

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlto = nome;
            }
        }

        System.out.println("--- Resultado ---");
        System.out.printf("A pessoa mais pesada é %s, com %.2f kg.\n", nomeMaisPesado, pesoMaisPesado);
        System.out.printf("A pessoa mais alta é %s, com %.2f metros.\n", nomeMaisAlto, alturaMaisAlta);

        read.close();
    }

    // método para ler inteira positivo (pesquisa)
    private static int lerInteiroPositivo(Scanner sc) {
        int num;
        while (true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num > 0) break;
                System.out.print("Por favor, digite um número positivo: ");
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor, insira um número inteiro: ");
            }
        }
        return num;
    }

    // método para ler double positivo (pesquisa0
    private static double lerDoublePositivo(Scanner sc) {
        double num;
        while (true) {
            try {
                num = Double.parseDouble(sc.nextLine());
                if (num > 0) break;
                System.out.print("Por favor, digite um valor positivo: ");
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor, insira um número: ");
            }
        }
        return num;
    }
}
