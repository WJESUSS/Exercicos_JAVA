package exe0056;

import java.util.Scanner;

public class while01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroSomado = 0;
		int numero ;
		
		do {
			System.out.println("Digite o numero (1111-para sair)");
			numero = sc.nextInt();
			
			if(numero!=1111) {
				numeroSomado += numero;
			}
		
		}while(numero!= 1111);
			System.out.println("A soma dos numero :" +numeroSomado);
	}
}
		
	




