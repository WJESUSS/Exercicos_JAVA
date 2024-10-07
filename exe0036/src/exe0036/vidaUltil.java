package exe0036;

import java.util.Scanner;

public class vidaUltil {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite a quantidade de horas de atividade física no mês: ");
	        int horasAtividade = scanner.nextInt();

	      
	        int pontos = 0;

	       
	        if (horasAtividade <= 10) {
	            pontos = horasAtividade * 2;
	        } else if (horasAtividade <= 20) {
	            pontos = (10 * 2) + ((horasAtividade - 10) * 5);
	        } else {
	            pontos = (10 * 2) + (10 * 5) + ((horasAtividade - 20) * 10);
	        }

	       
	        double dinheiro = pontos * 0.05;

	      
	        System.out.printf("Total de pontos: %d\n", pontos);
	        System.out.printf("Dinheiro ganho: R$%.2f\n", dinheiro);
	}

}
