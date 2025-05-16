public class Exercicio2_Condicionais {
    public static void main(String[] args) {
        double tempo = 92;

        //Blocos de código único
        if (tempo > 90){
            System.out.println("O tempo foi maior que 90!");
        }
        else if (tempo > 60){
            System.out.println("O tempo foi maior que 60!"); //não tem necessidade de executar a segunda pergunta pois a primeira já é verdadeira.
        }
    }
}
