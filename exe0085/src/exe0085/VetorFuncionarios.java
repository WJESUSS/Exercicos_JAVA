package exe0085;

import java.util.Scanner;

public class VetorFuncionarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double salario[] = new double[5];
		String nome[] = new String[5];
		String sexo[] = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite seu nome " +(i+1) +"°:");
			nome[i] = sc.nextLine();
			System.out.print("Digite seu sexo " +(i+1) + "°  (M-masculino , F-Femenino)");
			sexo[i] = sc.nextLine();
			System.out.print("Digite seu salario " +(i+1) +"° :");
			salario[i] = sc.nextDouble();
			sc.nextLine();

		}
		System.out.println("As funcionaaria que recebem mais de R$ 5.000");
		for (int i = 0; i < 5; i++) {
			if (sexo[i].equalsIgnoreCase("F") && salario[i] > 5000) {
				System.out.println("Nome: " + nome[i] + "  Salario: " + salario[i] + " sexo : " + sexo[i]);
			}
		}

	}

}
