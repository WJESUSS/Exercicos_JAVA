package exe0060;

import java.util.Scanner;

public class doWhileIdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int SomaIdade =0;
		int contadorIdade=0;
		int idade20OUmais=0;
		int idade20oumenos = 0;
		char continuar;

		
		do {
			System.out.print("Digite seu idade :");
			int idade = sc.nextInt();
			SomaIdade+=idade;
			contadorIdade++;
			
			if(idade>=21) {
				idade20OUmais++;
			}else if(idade <=20) {
				idade20oumenos++;
			}
			System.out.print("Deseja continuar Sim ou Não ?");
			 continuar =sc.next().toUpperCase().charAt(0);
		}while(continuar =='S');
		
		double mediaIdade = SomaIdade/contadorIdade;
		System.out.println("A quantidade de idade digitada :" +contadorIdade);
		System.out.println("Media de idade :" +mediaIdade);
		System.out.println("Idade maior que 21 anos :" +idade20OUmais);
		System.out.println("Idade menor que 20 anos :" +idade20oumenos);
		
		
	}

	
	
}
