import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Exercicio_1 {
    public static void main(String[] args) {
        System.out.println("Dados de Cadastro - Vagas Bosch");

        Scanner read = new Scanner(System.in);

        // Nome
        System.out.println("Digite o seu primeiro nome: ");
        String nome = read.nextLine();

        // Sobrenome
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = read.nextLine();

        // Data de nascimento
        System.out.println("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataTexto = read.nextLine();
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataTexto, dataFormatada);

        // Pretensão salarial
        System.out.println("Digite a sua pretensão salarial em reais: ");
        String pretensao_salarial = read.nextLine();

        // Grau de instrução
        System.out.println("Escolha seu grau de instrução de acordo com o número: ");
        System.out.println("1- Ensino médio \n2- Ensino técnico \n3- Ensino superior");

        int grau_instrucao = read.nextInt();
        read.nextLine(); // consome o '\n' que fica pendente

        String grauInstrucaoTexto;
        switch (grau_instrucao) {
            case 1 -> grauInstrucaoTexto = "Ensino médio";
            case 2 -> grauInstrucaoTexto = "Ensino técnico";
            case 3 -> grauInstrucaoTexto = "Ensino superior";
            default -> grauInstrucaoTexto = "Opção inválida";
        }

        // Cargo pretendido
        System.out.println("Digite o seu cargo pretendido: ");
        String cargo_pretendido = read.nextLine();

        // CNH tipo B
        System.out.println("Você possui CNH tipo B? (sim/não) ");
        String resposta = read.nextLine().trim().toLowerCase();

        boolean cnh;
        if (resposta.equals("sim")) {
            cnh = true;
        } else if (resposta.equals("não") || resposta.equals("nao")) {
            cnh = false;
        } else {
            System.out.println("Entrada inválida! Digite apenas 'sim' ou 'não'.");
            cnh = false;
        }

        // Impressão de todos os dados
        System.out.println("\n===== Dados do candidato - Bosch =====");
        System.out.printf(
                "Nome: %s\nSobrenome: %s\nData de nascimento: %s\nPretensão salarial: %s\nGrau de instrução: %s\nCargo pretendido: %s\nCNH tipo B: %b\n",
                nome,
                sobrenome,
                data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                pretensao_salarial,
                grauInstrucaoTexto,
                cargo_pretendido,
                cnh
        );

        // Fechando o Scanner
        read.close();
    }
}
