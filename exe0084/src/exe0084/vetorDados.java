package exe0084;

import java.util.Scanner;

public class vetorDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade []=new int[5];
		String nome [] = new String[5];
		
		for (int i = 0; i < nome.length; i++) {
			System.out.print("Digite seu nome posição :" +i);
			nome[i] = sc.nextLine();
			}
		for (int i = 0; i < idade.length ; i++) {
			System.out.print("Digite sua idade  :");
			idade[i]= sc.nextInt();
		}
		
		
		System.out.println("Pessoa menores de idade :");
	
		for (int i = 0; i < 5; i++) {
	
			if(idade[i]<18) {
				System.out.println("O nome "+nome[i]+ " idade " +idade[i]);
			}
		}
		}
     
	

}
