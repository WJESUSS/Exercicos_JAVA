package novo;

import java.util.Scanner;

public class RoupaPMG implements Item {
    private String descricao;
    private int quantidadeP, quantidadeM, quantidadeG;
    private int estoqueMinimoP, estoqueMinimoM, estoqueMinimoG;
    private int estoqueMaximoP, estoqueMaximoM, estoqueMaximoG;
    private double precoUnitario;
    private double valorTotalVendido;  // Armazena o valor total das vendas

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG,
                    int estoqueMinimoP, int estoqueMinimoM, int estoqueMinimoG,
                    int estoqueMaximoP, int estoqueMaximoM, int estoqueMaximoG, double precoUnitario) {
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimoP = estoqueMinimoP;
        this.estoqueMinimoM = estoqueMinimoM;
        this.estoqueMinimoG = estoqueMinimoG;
        this.estoqueMaximoP = estoqueMaximoP;
        this.estoqueMaximoM = estoqueMaximoM;
        this.estoqueMaximoG = estoqueMaximoG;
        this.precoUnitario = precoUnitario;
        this.valorTotalVendido = 0.0;
    }

    @Override
    public void reposicaoEstoque() {
        if (quantidadeP < estoqueMinimoP) quantidadeP = estoqueMaximoP;
        if (quantidadeM < estoqueMinimoM) quantidadeM = estoqueMaximoM;
        if (quantidadeG < estoqueMinimoG) quantidadeG = estoqueMaximoG;
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho (P, M ou G) para a venda: ");
        char tamanho = scanner.next().toUpperCase().charAt(0);
        switch (tamanho) {
            case 'P':
                if (quantidadeP > 0) {
                    quantidadeP--;
                    valorTotalVendido += precoUnitario;
                    System.out.println("Uma unidade do tamanho P de " + descricao + " vendida.");
                } else {
                    System.out.println("Estoque insuficiente para o tamanho P.");
                }
                break;
            case 'M':
                if (quantidadeM > 0) {
                    quantidadeM--;
                    valorTotalVendido += precoUnitario;
                    System.out.println("Uma unidade do tamanho M de " + descricao + " vendida.");
                } else {
                    System.out.println("Estoque insuficiente para o tamanho M.");
                }
                break;
            case 'G':
                if (quantidadeG > 0) {
                    quantidadeG--;
                    valorTotalVendido += precoUnitario;
                    System.out.println("Uma unidade do tamanho G de " + descricao + " vendida.");
                } else {
                    System.out.println("Estoque insuficiente para o tamanho G.");
                }
                break;
            default:
                System.out.println("Tamanho inválido.");
        }
    }

    @Override
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public double calcularValorTotal() {
        return valorTotalVendido;
    }

    public String getDescricao() {
        return descricao;
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

