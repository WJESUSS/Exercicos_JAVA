package exe0037;

import java.util.Scanner;

public class salarioFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double novoSalario;
		
		System.out.print("Digite o seu salario : ");
		double salario = sc.nextDouble();
		
		System.out.println("Digite seu genero : 1-Masculino , 2-Femenino");
		int genero = sc.nextInt();
		
		System.out.println("Tempo que trabalha na empresa :");
		int tempoEmpresa = sc.nextInt();
		
		if(genero == 2 && tempoEmpresa < 15) {
			novoSalario = salario + salario*0.05;
			System.out.println("O novo salario do funcionario é " +novoSalario);
		}else if(genero ==2 && tempoEmpresa >=15 && tempoEmpresa <20) {
			novoSalario = salario + salario*0.12;
			System.out.println("O novo salario do funcionario é " +novoSalario);
		}else if(genero == 2 && tempoEmpresa >=20) {
			novoSalario = salario + salario*0.25;
			System.out.println("O novo salario do funcionario é " +novoSalario);
		}else  if(genero == 1 && tempoEmpresa < 20) {
			novoSalario = salario + salario*0.03;
			System.out.println("O novo salario do funcionario é " +novoSalario);
		}else if(genero == 1 && tempoEmpresa >= 20 && tempoEmpresa < 30) {
			novoSalario = salario + salario*0.13;
			System.out.println("O novo salario do funcionario é " +novoSalario);
		}else if(genero == 1 && tempoEmpresa > 30){
			novoSalario = salario + salario*0.25;
			System.out.println("O novo salario do funcionario é " +novoSalario);
		}
		

	}

}
