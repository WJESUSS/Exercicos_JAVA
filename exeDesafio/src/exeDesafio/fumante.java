package exeDesafio;
import java.util.Scanner;

public class fumante {


		public static void main(String[] args) {
			
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Digite a quantidade de cigarros fumados por dia: ");
				int cigarrosPorDia = sc.nextInt();
				
				
				System.out.print("Digite a quantidade de anos que você já fumou: ");
				int anosFumados = sc.nextInt();
				
				
				int minutosPerdidosPorCigarro = 10;
				int minutosPorDia = 24 * 60;
				
      
				int totalCigarros = cigarrosPorDia * anosFumados * 365;
				
  
				int totalMinutosPerdidos = totalCigarros * minutosPerdidosPorCigarro;
				
      
				double totalDiasPerdidos = totalMinutosPerdidos / (double) minutosPorDia;
				
				
				System.out.printf("O total de dias de vida perdidos é: %.2f dias\n", totalDiasPerdidos);
			}
	        
	    }
	}


