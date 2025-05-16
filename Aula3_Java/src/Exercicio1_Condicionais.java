public class Exercicio1_Condicionais {
    public static void main(String[] args){
        double media = 4.1;
        int faltas = 50;
        boolean postura = false;

        String situacao;

        //Verdadeiro ou falso
        if (media >= 5.0 && faltas < 25 && postura==true ){  //&& é igual a and
            //caso seja verdadeiro ele vai executar os comandos dentro da chaves
            situacao = "Aprovado!";
        }
        else if (media < 5.0 && faltas < 25 && postura) {
            situacao = "Recuperação!"; //só pecou na média
        }
        else if (media >= 5.0 && faltas >= 25 && postura) {
            situacao = "Sem férias!"; //só pecou nas faltas
        }
        else if (media >= 5.0 && faltas < 25 && !postura){ //!postura é igual a postura==false
            situacao = "Chamar para conversar!"; //só pecou na postura
        }
        else {
            situacao = "Reprovado!";
        }

        System.out.println(situacao);
    }
}
