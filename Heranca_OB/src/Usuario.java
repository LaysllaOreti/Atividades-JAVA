public class Usuario {

    String nome;
    String senha;
    String email;

    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    //void são métodos sem retorno
    void autenticar(){
        System.out.printf("Usuário %s está autenticado\n", this.nome);
    }

    void autenticar(String sobrenome){
        System.out.printf("Usuário %s está autenticado\n", this.nome);
    }

    // sobreescrita
    // quando tenho na MESMA CLASSE métodos com assinaturas diferentes
    // sobrecarga é uma relação de herança

    // assinatura: quantidade e o tipo dos parâmetros de um método
    void concederAcessos(){
        System.out.printf("Usuário %s está com acessos regulares\n", this.nome);
    }

    void configurar(){

    }
}
