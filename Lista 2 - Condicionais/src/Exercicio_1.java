import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        // compreender a categoria dentro do if/else
        String categoria;
        if (idade >= 0 && idade <= 14) {
            categoria = "Criança";
        } else if (idade >= 15 && idade <= 17) {
            categoria = "Adolescente";
        } else if (idade >= 18 && idade <= 30) {
            categoria = "Adulto jovem";
        } else if (idade > 30) {
            categoria = "Adulto";
        } else {
            categoria = "Idade inválida";
        }
        System.out.println("Sua idade é " + idade + " anos, sua categoria é " + categoria);

        entrada.close();
    }
}
