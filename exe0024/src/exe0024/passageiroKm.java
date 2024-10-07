package exe0024;

import java.util.Scanner;

public class passageiroKm {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a distância em Km: ");
	        double distancia = sc.nextDouble();
	        
	        // Calcula o preço da passagem
	        double precoPorKm;
	        if (distancia <= 200) {
	            precoPorKm = 0.50;
	        } else {
	            precoPorKm = 0.45;
	        }
	        
	        double precoPassagem = distancia * precoPorKm;
	        
	        // Exibe o preço da passagem
	        System.out.printf("O preço da passagem é: R$%.2f\n", precoPassagem);
	        
	        sc.close();
	    }


}
