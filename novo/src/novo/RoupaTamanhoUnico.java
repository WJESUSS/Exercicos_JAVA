package novo;

import java.util.Scanner;

public class RoupaTamanhoUnico extends Peca {

    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo, double precoUnitario) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo, precoUnitario);
    }

    @Override
    public void venda() {
        if (quantidade > 0) {
            quantidade--;
            valorTotalVendido += precoUnitario;
            System.out.println("Uma unidade de " + descricao + " vendida.");
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }
}

