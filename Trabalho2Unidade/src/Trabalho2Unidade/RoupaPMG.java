package Trabalho2Unidade;

import java.util.Scanner;

public class RoupaPMG extends Peca implements itens  {
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
   

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        super(descricao,20, estoqueMinimo, estoqueMaximo);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	@Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamanho (P/M/G) da roupa (" + descricao + "): ");
        String tamanho = scanner.nextLine().toUpperCase();

        switch (tamanho) {
            case "P":
                if (quantidadeP > 0) {
                  quantidadeP--;
                 quantidadeVendida++;
                   
                } else {
                    System.out.println("Estoque insuficiente para tamanho P.");
                }
                break;
            case "M":
                if (quantidadeM > 0) {
                    quantidadeM--;
                    quantidadeVendida++;
                } else {
                    System.out.println("Estoque insuficiente para tamanho M.");
                }
                break;
            case "G":
                if (quantidadeG > 0) {
                    quantidadeG--;
                    quantidadeVendida++;
                } else {
                    System.out.println("Estoque insuficiente para tamanho G.");
                }
                break;
            default:
                System.out.println("Tamanho inválido.");
                break;
        }
    }

    @Override
    public void reposicaoEstoque() {
        if (quantidadeP < estoqueMinimo) {
            quantidadeP = estoqueMaximo;
        }
        if (quantidadeM < estoqueMinimo) {
            quantidadeM = estoqueMaximo;
        }
        if (quantidadeG < estoqueMinimo) {
            quantidadeG = estoqueMaximo;
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
    
    
}
