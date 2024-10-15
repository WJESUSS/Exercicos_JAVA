package exe0048;

import java.util.Scanner;

public class somatorioEntreNumero {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int numero;
		
		for (int i = 1; i < 7; i++) {
			System.out.print("Digite "  +i+ "° numero :");
		     numero = sc.nextInt();
		     soma +=numero;
		}
		System.out.print("A soma dos numero é " +soma);
	}

}
