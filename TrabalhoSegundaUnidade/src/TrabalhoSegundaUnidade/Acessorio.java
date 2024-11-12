package TrabalhoSegundaUnidade;

import java.util.Scanner;

import novo.Peca;

public class Acessorio extends Peca {

    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo, double precoUnitario) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo, precoUnitario);
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade vendida de " + descricao + ": ");
        int quantidadeVendida = scanner.nextInt();
        
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            valorTotalVendido += quantidadeVendida * precoUnitario;
            System.out.println(quantidadeVendida + " unidades de " + descricao + " vendidas.");
        } else {
            System.out.println("Quantidade em estoque insuficiente.");
        }
    }
}
