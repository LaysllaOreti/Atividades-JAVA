public class Main {

    // start do meu projeto
    public static void main(String[] args) {

        // classe - Instancia
        //Colaborador colaborador1 = new Colaborador("Leticia Roth"); // instanciação
        //Colaborador colaborador2 = new Colaborador("Julya Jacometti", 92906658);
        //Colaborador colaborador3 = new Colaborador("Yasmin Viera", 90876651,"Dev.Full-Stack");


        // especifico quais parametros quero
        //System.out.println(colaborador1.nome);
        //System.out.println(colaborador2.nome + " " + colaborador2.edv);
        //System.out.println(colaborador3.nome + " " + colaborador3.edv + " " + colaborador3.cargo);

        Departamento departamento = new Departamento("ETS", 1000000, 400);
        System.out.println(departamento);

        //departamento.atualizarNome("BTC");
        //System.out.println(departamento.nome);

        departamento.exibirDetalhes();
    }
}