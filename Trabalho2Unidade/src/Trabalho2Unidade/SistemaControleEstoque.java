package Trabalho2Unidade;

import java.util.Scanner;

public class SistemaControleEstoque implements itens {

    public static void main(String[] args) {
        Peca[] itens = new Peca[5];

     
        itens[0] = new RoupaPMG("Camisa", 30, 2, 15,6,9);
        itens[1] = new RoupaTamanhoUnico("Saia", 15, 1, 10);
        itens[2] = new Acessorio("Cinto", 8, 3, 12);
        itens[3] = new Acessorio("Pulseira", 7, 2, 10);
        itens[4] = new Acessorio("Saída de praia",3, 4, 5);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
        	
            System.out.println("Escolha um item para vender:");
            for (int i = 0; i < itens.length; i++) {
                System.out.println(i + " - " + itens[i].getDescricao());
            }
            System.out.println("5 - Sair do sistema");

            opcao = scanner.nextInt();
            if (opcao >= 0 && opcao < 5) {
                itens[opcao].venda();
                itens[opcao].reposicaoEstoque();
      
            } else if (opcao == 5) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        } while (true);
        System.err.println("----------------------------");
        System.out.println("Estoque final dos produtos:");
        for (Peca item : itens) {
            System.out.println(item.getDescricao() + ": " + item.getQuantidadeEstoque() + " unidades em estoque. " +
                               item.getQuantidadeVendida() + " unidades vendidas.");
            
        }
        scanner.close();
    }

	public void venda() {
		
		
	}

	@Override
	public void reposicaoEstoque() {
		
		
	}
}
