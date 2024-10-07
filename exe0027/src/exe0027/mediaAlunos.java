package exe0027;

import java.util.Scanner;

public class mediaAlunos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua primeiro nota ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite sua segunda nota ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if(media <=4.9) {
			System.out.println("O aluno esta em reprovado ");
		}else if(media >= 5 && media <=6.9 ) {
			System.out.println("O aluno estará em repureação ");
		}else {
			System.out.println("O aluno estar aprovado !");
		}
		

	}

}
