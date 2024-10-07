package exe0032;

import java.util.Random;
import java.util.Scanner;

public class jogoDeAdivinhação {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		Random randon = new Random();
     
		int NumeroSerSorteado = randon.nextInt(5)+1;
		
		System.out.print("Digite um numero entre (1 a 5)");
		int papite = sc.nextInt();
		
		if(papite==NumeroSerSorteado) {
			System.out.println("Voce acertou o numero ");
		}else {
			System.out.println("Voce nao acertou,tente novamente mais tarde!");
		}
	}
}

