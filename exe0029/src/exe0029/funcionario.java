package exe0029;

import java.util.Scanner;

public class funcionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite seu nome :");
		String nome = sc.nextLine();
		System.out.print("Digite o valor do seu salario :");
		double salario = sc.nextDouble();
		System.out.print("Quantos anos voçê trablha na empresa ");
		int tempoServico = sc.nextInt();
		
		double novoSalario;
		double salarioAtualizado;
		
		if(tempoServico <3) {
		      novoSalario = salario*0.03;
		    salarioAtualizado = novoSalario+salario;
		  	System.out.println("O salario com aumento de  3% foi de " +novoSalario+ " O salario ja com o aumento é de "+salarioAtualizado);
		}else if(tempoServico >=3 && tempoServico < 10) {
			novoSalario = salario*0.125;
			salarioAtualizado = novoSalario+salario;
			System.out.println("O salario com aumento de  12.5% foi de " +novoSalario + " O salario ja com o aumento é de "+salarioAtualizado);
			
		}else {
			novoSalario = salario*0.20;
			salarioAtualizado = novoSalario+salario;
			System.out.println("O salario com aumento de  20% foi de " +novoSalario + " O salario ja com o aumento é de "+salarioAtualizado);
		}
		
		

	}

}
