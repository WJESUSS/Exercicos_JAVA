package exe0014;

import java.util.Scanner;

public class locadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o km pecorrido:");
		double km = sc.nextDouble();
		System.out.println("Digite a quantidade de dias alugado:");
		int qtdDias =sc.nextInt();
		
		
		double valorKm =0.20;
		int valorDiaria = 90;
		
	
		double precoTotal = (valorKm*km)+(valorDiaria*qtdDias);
	
		
		
		System.out.println("O valor total do aluguel do carro é:" +precoTotal);

	}

}
