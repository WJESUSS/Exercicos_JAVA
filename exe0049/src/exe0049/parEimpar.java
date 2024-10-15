package exe0049;

import java.util.Scanner;

public class parEimpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		for (int i = 1; i < 6; i++) {
			System.out.print("Digite um numero :");
			numero =sc.nextInt();
			
			if(numero%2==0) {
				System.out.println( " Par" );
			}else {
				System.out.println( " impar ");
			}
	
		}

	}

}
