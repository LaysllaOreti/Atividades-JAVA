public class Exercicio_Tabuada_While {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 10 ) {
            int multiplicador = 1;
            System.out.println();
            System.out.println("Tabuada do: " + contador);

            while(multiplicador <=10) {
                int resultado = contador * multiplicador;

                System.out.println(contador + " x " + multiplicador + " = " + resultado);
                multiplicador ++;
            }
            contador ++ ;
        }
    }
}
