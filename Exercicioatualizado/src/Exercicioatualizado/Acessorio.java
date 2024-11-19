package Exercicioatualizado;

import java.util.Scanner;

public class Acessorio extends Peca implements Item{
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade vendida de " + getDescricao() + ": ");
        int quantidadeVendida = scanner.nextInt();
        if (quantidadeVendida <= getQuantidade()) {
            setQuantidade(getQuantidade() - quantidadeVendida);
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

	@Override
	public void controleEstoque() {
		System.out.println("Produto: " + this.descricao);
	     
        System.out.println("Quantidade restante no estoque: " + this.quantidade);
        System.out.println("Vezes que o estoque foi reposto : " +this.getContadorReposicao());
	}
}

