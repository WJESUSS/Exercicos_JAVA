package exe006;

import java.util.Scanner;

public class antecessor_Sucessor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero :");
		int numero = sc.nextInt();
		
		int sucessor = numero+1;
		int antecessor = numero-1;
		
		System.out.println("  " +antecessor+ " - " +numero+ " - "+sucessor);
	}

}
