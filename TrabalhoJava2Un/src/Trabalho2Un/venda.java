package Trabalho2Un;

import java.util.Scanner;

//Classe abstrata Peca
abstract class Peca {
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

 public abstract void venda();

 public void reposicaoEstoque() {
     if (quantidade < estoqueMinimo) {
         quantidade = estoqueMaximo;
         System.out.println("Estoque reabastecido para: " + descricao);
     }
 }

 public String getDescricao() {
     return descricao;
 }

 public int getQuantidade() {
     return quantidade;
 }
}

//Classe Acessorio
class Acessorio extends Peca {

 public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
     super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
 }

 @Override
 public void venda() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Quantidade vendida de " + descricao + ": ");
     int quantidadeVendida = scanner.nextInt();
     
     if (quantidadeVendida <= quantidade) {
         quantidade -= quantidadeVendida;
         System.out.println("Venda realizada. Estoque atual de " + descricao + ": " + quantidade);
     } else {
         System.out.println("Quantidade vendida maior que o estoque disponível.");
     }
 }
}

//Classe RoupaTamanhoUnico
class RoupaTamanhoUnico extends Peca {

 public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
     super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
 }

 @Override
 public void venda() {
     if (quantidade > 0) {
         quantidade--;
         System.out.println("Venda realizada. Estoque atual de " + descricao + ": " + quantidade);
     } else {
         System.out.println("Estoque esgotado de " + descricao);
     }
 }
}

//Classe RoupaPMG
class RoupaPMG extends Peca {
 private int quantidadeP;
 private int quantidadeM;
 private int quantidadeG;

 public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
     super(descricao, quantidadeP + quantidadeM + quantidadeG, estoqueMinimo, estoqueMaximo);
     this.quantidadeP = quantidadeP;
     this.quantidadeM = quantidadeM;
     this.quantidadeG = quantidadeG;
 }

 @Override
 public void venda() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Informe o tamanho (P, M ou G) para " + descricao + ": ");
     char tamanho = scanner.next().charAt(0);
     
     switch (tamanho) {
         case 'P':
             if (quantidadeP > 0) {
                 quantidadeP--;
                 System.out.println("Venda de tamanho P realizada. Estoque atual: " + quantidadeP);
             } else {
                 System.out.println("Estoque esgotado de tamanho P.");
             }
             break;
         case 'M':
             if (quantidadeM > 0) {
                 quantidadeM--;
                 System.out.println("Venda de tamanho M realizada. Estoque atual: " + quantidadeM);
             } else {
                 System.out.println("Estoque esgotado de tamanho M.");
             }
             break;
         case 'G':
             if (quantidadeG > 0) {
                 quantidadeG--;
                 System.out.println("Venda de tamanho G realizada. Estoque atual: " + quantidadeG);
             } else {
                 System.out.println("Estoque esgotado de tamanho G.");
             }
             break;
         default:
             System.out.println("Tamanho inválido.");
             break;
     }
 }

 @Override
 public void reposicaoEstoque() {
     if (quantidadeP < estoqueMinimo) {
         quantidadeP = estoqueMaximo;
         System.out.println("Estoque de tamanho P reabastecido.");
     }
     if (quantidadeM < estoqueMinimo) {
         quantidadeM = estoqueMaximo;
         System.out.println("Estoque de tamanho M reabastecido.");
     }
     if (quantidadeG < estoqueMinimo) {
         quantidadeG = estoqueMaximo;
         System
