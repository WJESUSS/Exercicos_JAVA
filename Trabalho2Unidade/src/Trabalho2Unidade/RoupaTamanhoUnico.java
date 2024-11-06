package Trabalho2Unidade;

public class RoupaTamanhoUnico extends Peca {

    public RoupaTamanhoUnico(String descricao, int quantidadeEstoque, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidadeEstoque, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        if (quantidadeEstoque > estoqueMinimo) {
            quantidadeEstoque--;
            quantidadeVendida++;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}

