package Trabalho2Unidade;

public abstract class Peca {
    protected String descricao;
    protected int quantidadeEstoque;
    protected int estoqueMinimo;
    protected int estoqueMaximo;
    protected int quantidadeVendida;

    public Peca(String descricao, int quantidadeEstoque, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.quantidadeVendida = 0;
    }

    public abstract void venda();
   

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void reposicaoEstoque() {
        if (quantidadeEstoque < estoqueMinimo) {
            quantidadeEstoque = estoqueMaximo;
        }
    }

	public void venda(int quantidade) {
		
		
	}
	

}

	