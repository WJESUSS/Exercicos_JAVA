package Trabalho2Unidade;

import java.util.Scanner;

public class Acessorio extends Peca {

    public Acessorio(String descricao, int quantidadeEstoque, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidadeEstoque, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade vendida do acessório (" + descricao + "): ");
        int quantidadeVendida = scanner.nextInt();
        if (quantidadeVendida <= quantidadeEstoque) {
            quantidadeEstoque -= quantidadeVendida;
            this.quantidadeVendida += quantidadeVendida;
        } else {
            System.out.println("Quantidade vendida excede o estoque disponível.");
        }
    }
}
