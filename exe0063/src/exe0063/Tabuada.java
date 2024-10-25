package exe0063;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("Digite um numero da tabuada: ");
		int numero = sc.nextInt();
		for(int i=1;i<11;i++) {
			
			int tabuada = i*numero;
			
			System.out.println(+i+ "X" +numero+ "=" +tabuada);
		}

	}

}
