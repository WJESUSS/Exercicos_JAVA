package TrabalhoCris;

import javax.swing.JOptionPane;

public class Acessorio extends Peca {
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        try {
            int quantidadeVendida = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida:"));
            if (quantidadeVendida > this.quantidade) {
                throw new IllegalArgumentException("Não há estoque suficiente para essa venda.");
            }
            this.quantidade -= quantidadeVendida;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Entrada inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
