package TrabalhoSegundaUnidade;

import java.util.Scanner;




public class SistemaControleDeEstoque{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Itens[] estoque = new Itens[5];
        estoque[0] = (Itens) new Acessorio("Cinto", 10, 2, 20, 50.0);
        estoque[1] = (Itens) new RoupaTamanhoUnico("Saia", 5, 1, 10, 120.0);
        estoque[2] =  new RoupaPMG("Camisa", 5, 5, 5, 2, 2, 2, 10, 10, 10, 150.0);
        estoque[3] = (Itens) new Acessorio("Pulseira", 15, 5, 20, 30.0);
        estoque[4] = (Itens) new RoupaTamanhoUnico("Saída de Praia", 8, 3, 15, 80.0);

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


