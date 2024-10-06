package exe0019;

import java.util.Scanner;

public class mediaAlunos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome :");
		String nome  = sc.nextLine();
		System.out.println("Informe sua primeira nota:");
		double nota1 = sc.nextDouble();
		System.out.println("Informe sua segunda nota:");
		double nota2 = sc.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if(media > 7) {
			System.out.println("O aluno(a) "+nome + " teve um bom aproveitamento com media  " +media);
		}else {
			System.out.println("O aluno(a) " +nome + " não teve um bom aproveitamento com media " +media);
		}

	}

}
