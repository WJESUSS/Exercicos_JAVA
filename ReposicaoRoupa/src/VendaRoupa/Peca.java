package VendaRoupa;


    abstract class Peca{
    protected String descricao;
    protected int quantidade;
    protected int estoqueMinimo;
    protected int estoqueMaximo;

    public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }


    public void venda(int quantidade) {
        if (quantidade > quantidade) {
            System.out.println("Não há estoque suficiente.");
        } else {
            setQuantidade(quantidade);
            reposicaoEstoque();
        }
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
