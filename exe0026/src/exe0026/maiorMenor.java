package exe0026;

import java.util.Scanner;

public class maiorMenor {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um numero :");
	int numero1 = sc.nextInt();
	System.out.println("Digite um numero :");
	int numero2 = sc.nextInt();
	
	
	if(numero1 > numero2) {
		int Maiornumero = numero1;
		System.out.println("O primeiro  numero é maior = " +Maiornumero);
	}else if(numero2 > numero1) {
		int MaiorNumero = numero2;
		System.out.println("O segundo numero é maior = " +MaiorNumero);
	}else {
		System.out.println("Os números são iguais ");
	}
	}

}
