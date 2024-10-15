package exe0045;

import java.util.Scanner;

public class forExercicio {

	public static void main(String[] args) {

			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite um numero : ");
			int numero = sc.nextInt();
			System.out.print("Digite um numero final : ");
			int numeroFinal = sc.nextInt();
			
		
			for (int i = numero; i > numeroFinal; i-=2) {
				System.out.println(" " +i);
			}
			

		}

	

	}


