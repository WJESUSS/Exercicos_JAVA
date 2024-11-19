package Exercicioatualizado;

import java.util.Scanner;
import java.io.ObjectInputStream.GetField;
import java.util.InputMismatchException;

public class SistemaControleEstoque {
	public static void main(String[] args) {
		Item[] itens = new Item[5];
		itens[0] = new Acessorio("Cinto", 10, 2, 15);
		itens[1] = new RoupaTamanhoUnico("Camisa", 5, 2, 10);
		itens[2] = new RoupaPMG("Calça", 1, 5, 5, 2, 10);
		itens[3] = new Acessorio("Pulseira", 8, 3, 20);
		itens[4] = new RoupaTamanhoUnico("Saia", 4, 1, 8);

		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("\nEscolha um item:");
				for (int i = 0; i < itens.length; i++) {
					System.out.println(i + " - " + itens[i].getDescricao());
				}
				System.out.println("5 - Sair do sistema");

				System.out.print("Opção: ");
				int opcao = scanner.nextInt();

				if (opcao == 5) {
					break;
				} else if (opcao >= 0 && opcao < itens.length) {
					itens[opcao].venda();
					itens[opcao].reposicaoEstoque();
					itens[opcao].controleEstoque();

				} else {
					System.out.println("Opção inválida.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, insira um número.");
				scanner.next();
			}
		}

		System.out.println("\nEstoque final:");
		for (Item item : itens) {
			if (item instanceof RoupaPMG) {
				RoupaPMG roupa = (RoupaPMG) item;
				System.out.println(roupa.getDescricao() + ": P - " + roupa.getQuantidadeP() + ", M - "
						+ roupa.getQuantidadeM() + ", G - " + roupa.getQuantidadeG());
				System.out.println("Reposições de estoque: P - " + roupa.getContadorReposicaoP() + ", M - "
						+ roupa.getContadorReposicaoM() + ", G - " + roupa.getContadorReposicaoG() + "");
			} else {
                Peca peca = (Peca)item;
             
				System.out.println(item.getDescricao() + ": " + item.getQuantidade() + " unidades");
				System.out.println("Reposições de estoque: " + item.getContadorReposicao());

			}
			
	
		}

	}
	

	
}
