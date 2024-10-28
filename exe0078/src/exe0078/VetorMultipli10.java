package exe0078;

import java.util.Scanner;

public class VetorMultipli10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []numeros = new int[15];
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero da " +i+ " posição :");
			numeros[i]=sc.nextInt();
			
			
		}
		
		System.out.println("Vetor completo :");
		for (int numero:numeros) {
			System.out.print(+numero+ " ");
			
			}
		System.out.println();
		System.out.println("Posição do multiplo de 10 :");
			for (int i = 0; i < numeros.length; i++) {
				System.out.println(" " );
				if(numeros[i]%10==0) {
					System.out.print("Posição " +i+ " : " +numeros[i]);
				}
				}
		}
	}


