package ContaBancaria;




public abstract class ContaBancaria {
    protected String senha;
    protected int numero;
    protected double saldo;
    protected int transacoesRealizadas;

    public ContaBancaria(String senha, int numero) {
        this.senha = senha;
        this.numero = numero;
        this.saldo = 0;
        this.transacoesRealizadas = 0;
    }

    public abstract void saca(double valor);
    public abstract void deposita(double valor);
    public abstract void tiraExtrato();

    protected void incrementarTransacoes() {
        this.transacoesRealizadas++;
    }
}