public class UsuarioAdmin extends Usuario{
    public UsuarioAdmin(String nome, String senha, String email){
        super(nome, senha, email);
    }

    // sobrecarga de métodos
    // sobrecarga é sempre quando temos uma relação de herança
    @Override
    void concederAcessos(){
        super.concederAcessos();
        System.out.printf("O usuário %s está com acessos administrativos", this.nome);
    }
}
