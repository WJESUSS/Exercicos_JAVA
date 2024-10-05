package exe0015;

import java.util.Scanner;

public class trabalhador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o dias de trabalho do funcionário : ");
		int dias=sc.nextInt();
		
		int horasDiaria = 8;
		double valorHora =35;
		
		double  salario =dias*horasDiaria*valorHora;
		
		System.out.println("O salario do funcionario é de "+salario);

	}

}
