package exe0017;

import java.util.Scanner;

public class velocidadeCarro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a velocidade do carro:");
		double velocidade = sc.nextDouble();
		
		double velocidadePermitida = 80;
		double valorMulta = 5;
	
		if(velocidade>velocidadePermitida) {
			double kmcima = velocidade-velocidadePermitida;
			double valorMultakm = kmcima*valorMulta;
			
			System.out.println("O usuario foi multado por esta velocidade a cima "+kmcima+ " KM o valor da multa é de "+valorMultakm);
		}else {
			System.out.println("Velocidade permitida");
		}


	}

}
