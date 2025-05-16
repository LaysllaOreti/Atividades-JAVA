public class Exemplo2_SwitchCase {
    public static void main(String[] args) {
        int opcao = 2;

        //Nessa nova escrita, nem tem a necessidade de utilizar o break
        switch (opcao){
            case 1 -> System.out.println("Caso 1");
            case 2 -> System.out.println("Caso 2");
            case 3 -> System.out.println("Caso 3");
            default -> System.out.println("Caso padrão!");
        }
    }
}
