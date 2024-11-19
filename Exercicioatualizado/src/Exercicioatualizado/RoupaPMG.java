package Exercicioatualizado;

import java.util.Scanner;

public class RoupaPMG extends Peca implements Item {
	private int quantidadeP;
	private int quantidadeM;
	private int quantidadeG;
    private int contadorReposicaoP;
	private int contadorReposicaoM;
	private int contadorReposicaoG;

	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
			int estoqueMaximo) {
		super(descricao, 0, estoqueMinimo, estoqueMaximo);
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.contadorReposicaoP = 0;
		this.contadorReposicaoM = 0;
		this.contadorReposicaoG = 0;
	}
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

	public void setQuantidadeP(int quantidadeP) {
		this.quantidadeP = quantidadeP;
	}

	public void setQuantidadeM(int quantidadeM) {
		this.quantidadeM = quantidadeM;
	}

	public void setQuantidadeG(int quantidadeG) {
		this.quantidadeG = quantidadeG;
	}


	@Override
	public void venda() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o tamanho (P, M ou G): ");
		String tamanho = scanner.next().toUpperCase();
		switch (tamanho) {
		case "P":
			if (quantidadeP > 0) {
				quantidadeP--;
			   
			} else {
				System.out.println("Estoque insuficiente.");
			}
			break;
		case "M":
			if (quantidadeM > 0) {
				quantidadeM--;
			} else {
				System.out.println("Estoque insuficiente.");
			}
			break;
		case "G":
			if (quantidadeG > 0) {
				quantidadeG--;
			} else {
				System.out.println("Estoque insuficiente.");
			}
			break;
		default:
			System.out.println("Tamanho inválido.");
			break;
		}
	}

	@Override
	public void reposicaoEstoque() {
		boolean reposicao = false;
		if (quantidadeP < getEstoqueMinimo()) {
			quantidadeP = getEstoqueMaximo();
			System.out.println("Reposição necessária para " + getDescricao() + " tamanho P");
			contadorReposicaoP++;
			reposicao = true;
		}
		if (quantidadeM < getEstoqueMinimo()) {
			quantidadeM = getEstoqueMaximo();
			System.out.println("Reposição necessária para " + getDescricao() + " tamanho M");
			contadorReposicaoM++;
			reposicao = true;
		}
		if (quantidadeG < getEstoqueMinimo()) {
			quantidadeG = getEstoqueMaximo();
			System.out.println("Reposição necessária para " + getDescricao() + " tamanho G");
			contadorReposicaoG++;
			reposicao = true;
		}
	
	
			if (reposicao) {
				System.out.println("Estoque de " + getDescricao() + " renovado ao máximo (P: " + getEstoqueMaximo()
						+ ", M: " + getEstoqueMaximo() + ", G: " + getEstoqueMaximo() + ").");
			} else {
				System.out.println("Estoque de " + getDescricao() + " não precisa de reposição.");
			}
	}
	

	public int getContadorReposicaoP() {
		return contadorReposicaoP;
	}

	public int getContadorReposicaoM() {
		return contadorReposicaoM;
	}

	public int getContadorReposicaoG() {
		return contadorReposicaoG;
	}

	public int getQuantidadeP() {
		return quantidadeP;
	}

	public int getQuantidadeM() {
		return quantidadeM;
	}

	public int getQuantidadeG() {
		return quantidadeG;
	}

	@Override
	public int getQuantidade() {
		return quantidadeP + quantidadeM + quantidadeG;
	}

	@Override
	public void controleEstoque() {	
	
		System.out.println(this.getDescricao() + ": P - " + this.getQuantidadeP() + ", M - " + this.getQuantidadeM()
				+ ", G - " + this.getQuantidadeG());
		System.out.println("Produto: " + this.descricao);
		System.out.println("Quantidade de vez estoque tamanho foi renovado P : " +contadorReposicaoP);
		System.out.println("Quantidade de vez estoque tamanho foi renovado M : " +contadorReposicaoM);
		System.out.println("Quantidade de vez estoque tamanho foi renovado G : " +contadorReposicaoG);

		
	}
	
}

