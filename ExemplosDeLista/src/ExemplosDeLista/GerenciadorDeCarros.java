package ExemplosDeLista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeCarros {
	private static List<Carro> listaDeCarros = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nMenu:");
			System.out.println("1 - Inserir carro");
			System.out.println("2 - Listar carros por preço");
			System.out.println("3 - Listar carros por marca");
			System.out.println("4 - Buscar carro");
			System.out.println("5 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				inserirCarro(scanner);
				break;
			case 2:
				listarCarrosPorPreco(scanner);
				break;
			case 3:
				listarCarrosPorMarca(scanner);
				break;
			case 4:
				buscarCarro(scanner);
				break;
			case 5:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 5);
	}

	private static void inserirCarro(Scanner scanner) {
		System.out.print("Marca: ");
		String marca = scanner.nextLine();
		System.out.print("Ano: ");
		int ano = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Cor: ");
		String cor = scanner.nextLine();
		System.out.print("Preço: ");
		double preco = scanner.nextDouble();

		Carro carro = new Carro(cor, ano, cor, preco);
		listaDeCarros.add(carro);
		System.out.println("Carro inserido com sucesso.");
	}

	private static void listarCarrosPorPreco(Scanner scanner) {
		System.out.print("Informe o preço máximo: ");
		double precoMaximo = scanner.nextDouble();

		System.out.println("Carros com preço igual ou menor que " + precoMaximo + ":");
		for (Carro carro : listaDeCarros) {
			if (carro.getPreco() <= precoMaximo) {
				System.out.println(carro);
			}
		}
	}

	private static void listarCarrosPorMarca(Scanner scanner) {
		System.out.print("Informe a marca: ");
		String marca = scanner.nextLine();

		System.out.println("Carros da marca " + marca + ":");
		for (Carro carro : listaDeCarros) {
			if (carro.getMarca().equalsIgnoreCase(marca)) {
				System.out.println(carro);
			}
		}
	}

	private static void buscarCarro(Scanner scanner) {
		System.out.print("Informe a marca: ");
		String marca = scanner.nextLine();
		System.out.print("Informe o ano: ");
		int ano = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Informe a cor: ");
		String cor = scanner.nextLine();

		boolean encontrado = false;
		for (Carro carro : listaDeCarros) {
			if (carro.getMarca().equalsIgnoreCase(marca) && carro.getAno() == ano
					&& carro.getCor().equalsIgnoreCase(cor)) {
				System.out.println("Carro encontrado: " + carro);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Carro não encontrado.");
		}
	}
}
