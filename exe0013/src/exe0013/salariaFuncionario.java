package exe0013;

import java.util.Scanner;

public class salariaFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");
		double salario = sc.nextDouble();
		
		double ValordoAumentoSalario = salario*0.15;
		double ValorTotal = salario+ValordoAumentoSalario;
		
		
		
		System.out.println("O valor do Aumento de salario é " +ValordoAumentoSalario);
		System.out.println("O valor total ja com aumento no salario "+ValorTotal);		
	}

}
