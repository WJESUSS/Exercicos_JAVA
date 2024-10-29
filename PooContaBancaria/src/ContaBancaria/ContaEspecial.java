package ContaBancaria;
public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String senha, int numero, double limite) {
        super(senha, numero);
        this.limite = limite;
    }

    @Override
    public void saca(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
            incrementarTransacoes();
        } else {
            System.out.println("Saldo e limite insuficientes.");
        }
    }

    @Override
    public void deposita(double valor) {
        saldo += valor;
        incrementarTransacoes();
    }

    @Override
    public void tiraExtrato() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("Total disponível: " + (saldo + limite));
        System.out.println("Transações realizadas: " + transacoesRealizadas);
    }
}
