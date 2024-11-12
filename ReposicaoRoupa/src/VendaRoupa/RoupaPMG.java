package VendaRoupa;

public class RoupaPMG extends Peca implements Item {
    private String descricao;
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMinimo;
    private int estoqueMaximo;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        char tamanho = Character.toLowerCase(scanner.next().charAt(0));
        int quantidadeVendida = 0;

        switch (tamanho) {
            case 'p':
                quantidadeVendida = Math.min(1, quantidadeP);
                break;
            case 'm':
                quantidadeVendida = Math.min(1, quantidadeM);
                break;
            case 'g':
                quantidadeVendida = Math.min(1, quantidadeG);
                break;
        }

        setQuantidade(getQuantidade() - quantidadeVendida);
        reposicaoEstoque();
    }

    private void setQuantidade(int quantidade) {
        this.quantidadeP -= quantidade;
        this.quantidadeM -= quantidade;
        this.quantidadeG -= quantidade;
    }

    private void reposicaoEstoque() {
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

    public String getDescricao() { return descricao; }
    public int getQuantidadeP() { return quantidadeP; }
    public int getQuantidadeM() { return quantidadeM; }
    public int getQuantidadeG() { return quantidadeG; }
    public int getEstoqueMinimo() { return estoqueMinimo; }
    public int getEstoqueMaximo() { return estoqueMaximo; }
}