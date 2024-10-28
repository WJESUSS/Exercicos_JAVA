package exe0080;

import java.util.Random;
import java.util.Scanner;

public class VetorSorteio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorS[] = new int [30];

		
		for (int i = 0; i < vetorS.length; i++) {
			Random rd = new Random();
			
			vetorS[i] = rd.nextInt(1,15);
		}
		
			System.out.println("Digite um numero (1-15) :");
			int numero = sc.nextInt();
  
			int contador=0;
			
			System.out.println("A chave foi encontrada nas posições:");
		for (int i = 0; i < vetorS.length; i++) {
			System.out.println(" ");
			
			if(vetorS[i]==numero) {
				System.out.println(i);
				contador++;
			}
		}
		System.out.println("A chave " + numero + " foi sorteada " + contador + " vezes.");
	}

}
