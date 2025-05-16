public class Exemplo_SwitchCase {
    public static void main(String[] args) {
        int opcao = 2;

        //Escrita antiga
        switch (opcao){
            case 1:
                System.out.println("Caso 1");
                break;
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                System.out.println("Caso 3");
                break;
            default:    //como se fosse o "else"
                System.out.println("Caso padrão!");
        }
    }
}
