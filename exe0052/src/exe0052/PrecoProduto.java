package exe0052;

import java.util.Scanner;

public class PrecoProduto {

	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		
		double preco[] = new double [8];
		double maiorPreco = Double.MIN_VALUE;
		double menosPreco = Double.MAX_VALUE;
		
		
		for (int i = 0; i < preco.length; i++) {
			System.out.print("Digite o preço N°" +(i+1)+ "  produto :");
			preco[i]=sc.nextDouble();
			if(preco[i]>maiorPreco) {
				maiorPreco=preco[i];
		}
			if(preco[i] < menosPreco) {
				menosPreco = preco[i];
			}
		
		}
		System.out.println("O maior preço " +maiorPreco);
		System.out.println("O menor preço "+ menosPreco);
	}
}