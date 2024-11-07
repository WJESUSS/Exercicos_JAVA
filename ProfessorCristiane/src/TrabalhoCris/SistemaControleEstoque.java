package TrabalhoCris;

import javax.swing.JOptionPane;

public class SistemaControleEstoque {
    private Peca[] itens;

    public SistemaControleEstoque() {
        this.itens = new Peca[5];
        this.inicializarItens();
    }

    private void inicializarItens() {
        this.itens[0] = new Acessorio("Camisa", 1, 5, 15);
        this.itens[1] = new RoupaTamanhoUnico("Saia", 8, 3, 12);
        this.itens[2] = new Acessorio("Cinto", 7, 3, 10);
        this.itens[3] = new Acessorio("Pulseira", 15, 5, 20);
        this.itens[4] = new RoupaPMG("Saída de praia", 12, 8, 10, 5, 15);
    }

    public void mostrarMenu() {
        while (true) {
            String[] opcoes = {"1 - Vender item", "2 - Verificar estoque", "3 - Sair"};
            int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n" + String.join("\n", opcoes)));
            
            switch (escolha) {
                case 1:
                    this.venderItem();
                    break;
                case 2:
                    this.verificarEstoque();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private void venderItem() {
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice do item (0-4):")) - 1;
        if (indice >= 0 && indice < this.itens.length) {
            this.itens[indice].venda();
            this.itens[indice].reposicaoEstoque();
            JOptionPane.showMessageDialog(null, "Venda concluída com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void verificarEstoque() {
        StringBuilder mensagem = new StringBuilder("Estoque atualizado:\n");
        for (int i = 0; i < this.itens.length; i++) {
            mensagem.append((i + 1) + ". ").append(this.itens[i].getDescricao()).append(": ").append(this.itens[i].getQuantidade()).append("/").append(this.itens[i].getEstoqueMaximo()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Estoque Atualizado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SistemaControleEstoque sistema = new SistemaControleEstoque();
        sistema.mostrarMenu();
    }
}
