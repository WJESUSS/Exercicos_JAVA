package exe0076;

import java.util.Random;

public class vetorRandom {

	public static void main(String[] args) {
		
		int []vetor = new int [50];
		
		for (int i = 0; i < vetor.length; i++) {
			Random rd = new Random();
			vetor[i] = rd.nextInt(0,50);
		}

		System.out.println("Os numeros gerado :");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(" " +vetor[i]);
			
		}
	
	}

}
