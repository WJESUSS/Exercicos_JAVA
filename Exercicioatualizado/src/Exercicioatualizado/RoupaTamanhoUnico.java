package Exercicioatualizado;

public class RoupaTamanhoUnico extends Peca implements Item {
    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        if (getQuantidade() > 0) {
            setQuantidade(getQuantidade() - 1);
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

	@Override
	public void controleEstoque() {
	
		System.out.println("Produto: " + this.descricao);
        System.out.println("Quantidade restante no estoque: " + this.quantidade);
       
		
	}
}
