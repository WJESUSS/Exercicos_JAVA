package exe003;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();
		System.out.println("Digite seu salario:");
		float salario = sc.nextFloat();
		
		System.out.println("O nome do funcionario é " +nome+ " e o salario " +salario);
		
	}

}
