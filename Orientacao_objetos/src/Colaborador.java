public class Colaborador {
    // uma classe pode ser considerada um molde através do qual objetos de um certo tipo são criados
    // abstração: modelo de um conjutos de objetos com caracteristicas semelhantas
    // podem possuir características diferentes, mas possuem as mesmas propriedades e fucnionalidades
    // instância: Como vou referenciar naquele contexto

    // atributos da classe Coloaborador
    int edv;
    String nome;
    String cargo;

    // construtor padrão existe em toda classe
    // método Construtor sem parâmetro
    Colaborador(){
        System.out.println("Construtor sem parametros foi inicializado");
    }

    // método Construtor com  parametro, sem parametro reclamaria
    Colaborador(String nome){
        // this = self do Python, se referindo ao atributo da classe
        this.nome = nome;
        System.out.println("Construtor com um parâmetro foi inicializado");
    }

    // método construtor com dois
    Colaborador(String nome, int edv){
        this.nome = nome;
        this.edv = edv;
        System.out.println("Construtor com dois parametros foi incializado");
    }

    // método Construtor com tres
    Colaborador(String nome, int edv, String cargo) {
        this.nome = nome;
        this.edv = edv;
        this.cargo = cargo;
        System.out.println("Construtor com três parametros foi inicializado");
    }
}