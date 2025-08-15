import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {
        //for (int i = 10; i > 0; i--) { //++ é operador de incremento e o operador -- é decremento
            //System.out.println(i);

        //for (int i = 0; i <= 10; i ++) {
            //if (i==5){
                //break; //quebrar o laço de reptição
            //}
            //System.out.println(i);
        //}

        //for (int i = 0; i <= 10; i ++) {
            //if(i%2==0) {
                //continue; //reinicia o laço de repetição
            //}
            //System.out.println(i);
        //}

        //FOR ENCADEADO
        //for (int i = 0; i < 3; i ++) {
            //System.out.println("\nDS18");
            //for (int j = 0; j < 2; j++) {
                //System.out.println("\nDigital Solutions");
                //break;
            //}
        //}

        /*:
         for (int i = 0; i < 3; i ++) {
            System.out.println("\nDS18");

            for (int j = 0; j < 2; j++) {
                System.out.println("\nDigital Solutions");
                break externo; //permite quebrar o laço externo
            }
         }
         */

        /*Scanner entrada = new Scanner(System.in);
        String valor = "";

        /*Toda vez que o usuário digitar algo diferente de sair, o código continua,
        * quando o usuário digitar a palavra "sair", o código encerra
        *
        * */

        //Strings só se compara com método equals, não utilize ==

        //== só se utiliza para tipo primitivo de dados (int, doulbe, boolean, etc
        /*while(!valor.equalsIgnoreCase("sair")) {
            System.out.print("Digite algo:");
            valor = entrada.nextLine();
        }

        entrada.close();
        */

        Scanner entrada = new Scanner(System.in);
        int contador =0, acumulador=0;

        while (contador < 5) {
            System.out.println(contador);
            contador ++;
            System.out.print("Digite um número: ");
            acumulador+=entrada.nextInt();
            System.out.printf("Contador está em %d e " +
                    "o acumulador está em %d\n", contador, acumulador);
        }
        entrada.close();
    }
}
