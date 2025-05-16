import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        double mult1, mult2, elevado1, elevado2, elevado3, elevado4, divisao, resultado;

        elevado1 = Math.pow(-3.0/4.0, -2);
        elevado2 = Math.pow(3,-1)/4;
        elevado3 = Math.pow(-3.0/4.0, -1);

        mult1 = 3 * elevado1 + 6 * elevado2 -4;
        mult2 = 7 * elevado3 + 2;

        divisao = mult1 / mult2;
        elevado4 = Math.pow(divisao,-1);

        resultado = elevado4 + 4;

        System.out.println(resultado);
    }
}
