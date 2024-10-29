package ContaBancaria;


public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String senha, int numero) {
        super(senha, numero);
    }

    @Override
    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            incrementarTransacoes();
        } else {
            System.out.println("Saldo insuficiente.");
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
        System.out.println("Transações realizadas: " + transacoesRealizadas);
    }
}

