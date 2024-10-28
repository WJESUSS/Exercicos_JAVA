package exe0079;

import java.util.Scanner;

public class vetorPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetorPar[] = new int[10];
		
		for (int i = 0; i < vetorPar.length; i++) {
			System.out.print("Digite os numeros inteiros :");
			vetorPar[i]=sc.nextInt();
		}
		for (int i = 0; i < vetorPar.length; i++) {
			System.out.println("Vetor : "+vetorPar[i]);
		}
		for (int i = 0; i < vetorPar.length; i++) {
			System.out.println(" ");
			if(vetorPar[i]%2==0) {
				System.out.println("Posição "+i+ "° :  " +vetorPar[i]);
			}
		}

	}

}
