package exe0011;

import java.util.Scanner;

public class equacaoSegundoGrau {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite o numero da posição A:");
		int A =sc.nextInt();
		System.out.println("Digite o numero da posição B :");
		int B = sc.nextInt();
		System.out.println("Digite o numero da posição C :");
		int C = sc.nextInt();
		
		int delta = B*B-4*A*C;
		
		System.out.println("O valor de delta é " +delta);

	}

}
