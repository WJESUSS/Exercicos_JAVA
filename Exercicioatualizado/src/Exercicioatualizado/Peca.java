package Exercicioatualizado;

public abstract class Peca implements Item {
    protected String descricao;
    protected int quantidade;
    protected int estoqueMinimo;
    protected int estoqueMaximo;
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
        	System.out.println("Reposição necessária para : " + descricao);
            this.quantidade = this.estoqueMaximo;
            System.out.println("Estoque de " + descricao + " renovado ao máximo (" + estoqueMaximo + ").");
            contadorReposicao++;
            } else { 
            	System.out.println("Estoque de " + descricao + " está acima do mínimo.");
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

	
  }
    
