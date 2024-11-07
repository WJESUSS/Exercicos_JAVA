package TrabalhoCris;

import javax.swing.JOptionPane;

public class RoupaPMG extends Peca {
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidadeP, estoqueMinimo, estoqueMaximo);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
    }

    @Override
    public void venda() {
        try {
            String tamanho = JOptionPane.showInputDialog("Digite o tamanho (P, M ou G):");
            char t = Character.toUpperCase(tamanho.charAt(0));
            switch (t) {
                case 'P':
                    if (this.quantidadeP > 0) {
                        this.quantidadeP--;
                    } else {
                        throw new IllegalArgumentException("Não há mais peças deste tamanho disponíveis.");
                    }
                    break;
                case 'M':
                    if (this.quantidadeM > 0) {
                        this.quantidadeM--;
                    } else {
                        throw new IllegalArgumentException("Não há mais peças deste tamanho disponíveis.");
                    }
                    break;
                case 'G':
                    if (this.quantidadeG > 0) {
                        this.quantidadeG--;
                    } else {
                        throw new IllegalArgumentException("Não há mais peças deste tamanho disponíveis.");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Tamanho inválido.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void reposicaoEstoque() {
        if (this.quantidadeP < this.estoqueMinimo) {
            this.quantidadeP = this.estoqueMaximo;
        }
        if (this.quantidadeM < this.estoqueMinimo) {
            this.quantidadeM = this.estoqueMaximo;
        }
        if (this.quantidadeG < this.estoqueMinimo) {
            this.quantidadeG = this.estoqueMaximo;
        }
    }
}