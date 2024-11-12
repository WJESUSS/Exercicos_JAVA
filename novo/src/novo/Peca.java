package novo;



public abstract class Peca implements itens {
    protected String descricao;
    protected int quantidade;
    protected int estoqueMinimo;
    protected int estoqueMaximo;
    protected double precoUnitario;
    protected double valorTotalVendido;  // Armazena o valor total das vendas

    public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo, double precoUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.precoUnitario = precoUnitario;
        this.valorTotalVendido = 0.0;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double calcularValorTotal() {
        return valorTotalVendido;
    }

    public void reposicaoEstoque() {
        if (quantidade < estoqueMinimo) {
            quantidade = estoqueMaximo;  // Reposição para o estoque máximo
        }
    }

    public abstract void venda();  // Método abstrato para a venda
}

