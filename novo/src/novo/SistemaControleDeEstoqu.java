package novo;

import java.util.Scanner;

public class SistemaControleDeEstoqu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        itens[] estoque = new itens[5];
        estoque[0] = new Acessorio("Cinto", 10, 2, 20, 50.0);
        estoque[1] = new RoupaTamanhoUnico("Saia", 5, 1, 10, 120.0);
        estoque[2] = (itens) new RoupaPMG("Camisa", 5, 5, 5, 2, 2, 2, 10, 10, 10, 150.0);
        estoque[3] = new Acessorio("Pulseira", 15, 5, 20, 30.0);
        estoque[4] = new RoupaTamanhoUnico("Saída de Praia", 8, 3, 15, 80.0);

        while (true) {
           
            System.out.println("\nMenu:");
            for (int i = 0; i < estoque.length; i++) {
                System.out.println(i + " - " + ((Peca) estoque[i]).getDescricao());
            }
            System.out.println("5 - Sair");
            System.out.print("Escolha um produto para realizar a venda (0-4): ");
            int opcao = scanner.nextInt();

            if (opcao == 5) {
                
                double valorTotalGeral = 0;
                System.out.println("\nEstoque final:");
                for (int i = 0; i < estoque.length; i++) {
                    System.out.println(((Peca) estoque[i]).getDescricao() + " - Estoque: " + ((Peca) estoque[i]).calcularValorTotal());
                    valorTotalGeral += ((Peca) estoque[i]).calcularValorTotal();
                }
                System.out.println("\nValor total das vendas: R$ " + valorTotalGeral);
                break;
            }

            if (opcao >= 0 && opcao < 5) {
              
                estoque[opcao].venda();
                estoque[opcao].reposicaoEstoque();
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

