package exe0056;

import java.util.Scanner;

public class while01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float salarioHomem =0;
		float salarioMulher = 0;
		char continuar;
		
		
		do {
			System.out.println("Digite seu sexo M-MASCULINO,F-FEMENINO");
			char sexo = sc.next().toUpperCase().charAt(0);
			System.out.println("Digite seu salario:");
			double salario = sc.nextFloat();
			
			if(sexo=='F') {
				salarioMulher+=salario;
			}else if(sexo =='M') {
				salarioHomem+=salario;
			}
				System.out.println("Voce deseja continuar sim ou não ?");
				continuar = sc.next().toUpperCase().charAt(0);
		}while(continuar=='S');
		
			System.out.println("O soma do salario das mulheres "+salarioMulher);
			System.out.println("O soma do salario das homens "+salarioHomem);
		
		}
	

}