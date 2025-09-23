import java.util.Scanner;

import java.util.InputMismatchException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Desafio {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // inicializo e determino as minhas variáveis como 0 para começar
        double posicaoA = 0;
        double posicaoB = 0;
        double velocidadeA = 0;
        double velocidadeB = 0;

        System.out.println("-- DESAFIO COLISÃO DE TRENS ---");

        // validar a posição do primeiro trem (A)
        while (true) {
            System.out.print("Por favor, digite a posicao inicial do trem A (0 a 10000 KM): ");
            try {
                posicaoA = read.nextDouble();

                if (posicaoA >= 0 && posicaoA <= 10000) {
                    break;
                } else {
                    System.out.println("Você inseriu uma posição inválida. A posicao deve estar entre 0 e 10000 KM.");
                }
                // caso o usuário insira uma String
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor, digite um número.");
                read.next();
            }
        }

        // validação do segundo trem (B)
        while (true) {
            System.out.print("Por favor, digite a posicao inicial do trem B (0 a 10000 KM): ");
            try {
                posicaoB = read.nextDouble();
                if (posicaoB >= 0 && posicaoB <= 10000) {
                    break;
                } else {
                    System.out.println("Você inseriu uma posição inválida. A posição deve estar entre 0 e 10000 KM.");
                }
                // caso o usuário insira uma String
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor, digite um número.");
                read.next();
            }
        }

        // validação da velocidade do primeiro trem
        while (true) {
            System.out.print("Por favor, digite a velocidade do trem A (positiva, ate 300 km/h): ");
            try {
                velocidadeA = read.nextDouble();
                if (velocidadeA > 0 && velocidadeA <= 300) {
                    break;
                } else {
                    System.out.println("Você digitou uma velocidade inválida. Ela deve ser positiva e até no máximo 300 km/h.");
                }
                // caso o usuário coloque uma String
            } catch (InputMismatchException e) {
                System.out.println("Você inseriu uma entrada inválida. Por favor, digite um número para validação.");
                read.next();
            }
        }

        // validação da velocidade do segundo trem
        while (true) {
            System.out.print("Por favor, digite a velocidade do trem B -> negativa, ate -300 km/h: ");
            try {
                velocidadeB = read.nextDouble();
                if (velocidadeB < 0 && velocidadeB >= -300) {
                    break;
                } else {
                    // sentido contrário
                    System.out.println("Você digitou uma velocidade inválida. Ela deve ser negativa e até no máximo -300 km/h.");
                }
                // caso o usuário coloque uma String
            } catch (InputMismatchException e) {
                System.out.println("Você inseriu uma entrada inválida. Por favor, digite um número para validação.");
                read.next();
            }
        }

        // verificação e cálcuo (a física agindo)
        if (posicaoA > posicaoB) {
            System.out.println("\nOs trens não vão se colidir, pois estão ficando mais distantes um do outro".");
        } else {
            // cálculo do tempo (em horas)
            double tempoHoras = (posicaoB - posicaoA) / (velocidadeA - velocidadeB);

            if (tempoHoras < 0) {
                System.out.println("\nOs trens não irão se colidir.");
            } else {
                // cálculo da posição da colisão
                double posicaoColisao = posicaoA + velocidadeA * tempoHoras;

                // conersão do tempo (horas para segundos)
                double tempoSegundos = tempoHoras * 3600;

                // cálcular o horário da colisão
                LocalTime horaInicio = LocalTime.of(17, 0, 0);
                LocalTime horaColisao = horaInicio.plusSeconds((long) tempoSegundos);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                String horarioFormatado = horaColisao.format(formatter);

                System.out.printf("\nA colisao de trens vai acontecer no KM %.2f e ocorrerá depois de %.0f segundos no horario de %s.\n",
                        posicaoColisao, tempoSegundos, horarioFormatado);
            }
        }
        read.close();
    }
}