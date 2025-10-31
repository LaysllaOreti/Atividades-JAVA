public class Main {
    public static void main(String[] args) {

        // Herança é algo passado de pai pra filho

        // superclasse: médico; sublcasses: especialidade médica

        // reuso de código

        // Mensalista mensalista = new Mensalista(92769055, "Giovanna", "Técnica da Qualidade", 4000);
        // System.out.println(mensalista);

        // Horista daniel = new Horista(92906678, "Daniel", "Operador de Manufatura", 240, 8.50);
        // System.out.printf("O salário de Daniel é: %.2fR$",daniel.receberSalario());

       // Usuario usuario = new Usuario("Isabella", "12345678", "isabella@ets.com.br");
        //usuario.autenticar();
        //usuario.concederAcessos();

        //System.out.printf("---------------------------------------------------------------------------\n");

        //UsuarioAdmin usuarioAdmin = new UsuarioAdmin("Leticia", "123456789", "leticia@ets.com.br");
        //usuarioAdmin.autenticar();
        //usuarioAdmin.concederAcessos();

        Prioridade prioridade = Prioridade.ALTA;

        switch (prioridade){
            case BAIXA -> System.out.println("Chamado com Prioridade Baixa, resolver quando houver disponibilidade.");
            case MEDIA -> System.out.println("Chamado com Prioridade Média, resolver assim que possível.");
            case ALTA -> System.out.println("Chamado com Prioridade Alta, resolver o quanto antes.");
            case URGENTE -> System.out.println("Chamado Urgente, resolver agora!");
        }
    }
}