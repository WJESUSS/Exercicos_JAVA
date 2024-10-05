package exe0012;

import java.util.Scanner;

public class precoProduto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto:");
		double valorProduto = sc.nextDouble();
		
		double valorPromocao = valorProduto*0.05;
		double valorTotalComDesconto = valorProduto -valorPromocao;
		
		System.out.println("O valor do desconto produto  " +valorPromocao+ " reais  Valor do produdo com desconto é "+valorTotalComDesconto+"reais");

	}

}
