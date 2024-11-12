package Exercicioatualizado;

public abstract class Peca implements Item {
    protected String descricao;
    protected int quantidade;
    private int estoqueMinimo;
    private int estoqueMaximo;
	protected int contadorReposicao = 0;
	private int controleEstoque;

    public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
       
    }

    @Override
    public void reposicaoEstoque() {
        if (this.quantidade < this.estoqueMinimo) {
            this.quantidade = this.estoqueMaximo;
            contadorReposicao++;
        }
    }
    
    @Override
    public int getContadorReposicao() {
		return contadorReposicao;
	}

	@Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

	public abstract void venda();

	@Override
  public abstract void controleEstoque();

	public int getControleEstoque() {
		return controleEstoque;
	}

	public void setControleEstoque(int controleEstoque) {
		this.controleEstoque = controleEstoque;
	}
  }
    
