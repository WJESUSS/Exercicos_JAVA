package exe009;

import java.util.Scanner;

public class dinheirePessoa {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais: ");
		double reais = sc.nextDouble();
		
		double dolar = 5.45;
		
		double total = reais/dolar;
		
		System.out.println("O total em dolar comprado é :" +total);

	}

}
