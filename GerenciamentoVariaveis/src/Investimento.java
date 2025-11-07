public class Investimento {
    String nomeDoInvestidor;
    double saldoAtual;
    static double taxaDeRentabilidade = 0.02;

    public Investimento(String nomeDoInvestidor, double saldoAtual) {
        this.nomeDoInvestidor = nomeDoInvestidor;
        this.saldoAtual = saldoAtual;
    }

    void rentabilizar(){
        this.saldoAtual = this.saldoAtual * (1+taxaDeRentabilidade);
    }
}
