package VendaRoupa;

public class RoupaTamanhoUnico extends Peca {
    private String descricao;
    private int quantidade;
    private int estoqueMinimo;
    private int estoqueMaximo;
    
    
     public RoupaTamanhoUnico(String descricao,int estoqueMaximo,int estoqueMinimo,int quantidade) {
    	 this.descricao=descricao;
    	 this.estoqueMaximo = estoqueMaximo ;
    	 this.estoqueMinimo = estoqueMinimo;
    	 this.quantidade = quantidade;
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public void venda() {
        setQuantidade(getQuantidade() - 1);
        reposicaoEstoque();
    }

    private void setQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    private void reposicaoEstoque() {
        if (quantidade < estoqueMinimo) {
            quantidade = estoqueMaximo;
        }
    }

    public String getDescricao() { return descricao; }
    public int getQuantidade() { return quantidade; }
    public int getEstoqueMinimo() { return estoqueMinimo; }
    public int getEstoqueMaximo() { return estoqueMaximo; }
}
