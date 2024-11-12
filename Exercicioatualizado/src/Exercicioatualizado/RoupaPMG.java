package Exercicioatualizado;

import java.util.Scanner;

public  class RoupaPMG extends Peca implements Item {
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private int contadorReposicaoP;
    private int contadorReposicaoM;
    private int contadorReposicaoG;

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

	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, 0, estoqueMinimo, estoqueMaximo);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.contadorReposicaoP =0;
        this.contadorReposicaoM=0;
        this.contadorReposicaoG = 0;
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
        if (quantidadeP < getEstoqueMinimo()) {
            quantidadeP = getEstoqueMaximo();
            contadorReposicaoP++;
        }
        if (quantidadeM < getEstoqueMinimo()) {
            quantidadeM = getEstoqueMaximo();
            contadorReposicaoM++;
        }
        if (quantidadeG < getEstoqueMinimo()) {
            quantidadeG = getEstoqueMaximo();
            contadorReposicaoG++;
        }
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
		System.out.println("Produto: " + this.descricao);
        System.out.println("Quantidade restante no estoque: " + this.quantidade);
		
	}
    
}
