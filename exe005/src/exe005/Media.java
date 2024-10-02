package exe005;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota:");
		double nota2 = sc.nextDouble();

		double media = (nota1+nota2)/2;
		
		System.out.println("Media dos alunos " +media);
	}

}
