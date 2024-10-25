package exe0057;

import java.util.Scanner;

public class doWhileFuncionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		double somaDosSalarios =0;
		int continuar;
		int sexo ;
		double salario;
		
		do {
			System.out.println("Digite seu salario :");
			 salario = sc.nextFloat();
			 System.out.println("Deseja continuar ? Digite 1-SIM OU 2-NÃO");
			 continuar= sc.nextInt();
			//System.out.println("Digite seu sexo 1-masculino , 2-Femenino");
		     // sexo= sc.nextInt();
			
			
			if(continuar ==1) {
				somaDosSalarios+=salario;
			}
	}while(continuar==1);	
			System.out.println("A soma dos salarios é " +somaDosSalarios);
		
		}
	
}
	




		
		
		
	




