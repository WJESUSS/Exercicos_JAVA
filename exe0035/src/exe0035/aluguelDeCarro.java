package exe0035;

import java.util.Scanner;

public class aluguelDeCarro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double carroPopular  = 90;
		double carroLuxo = 150;
		double totatalDiaria;
		double valorDokm;
		
		System.out.print("Qual o tipo de carro que desejar alugar 1-Popular , 2-Luxo");
		int aluguel = sc.nextInt();
		
		System.out.print("Quantos dias de aluguel :");
		int diasAlugado = sc.nextInt();
		
		System.out.print("Quantos km foi pecorrido: ");
		double kmPecorrido = sc.nextDouble();
		
		if(aluguel == 1 && kmPecorrido <= 100) {
			totatalDiaria = carroPopular*diasAlugado;
			valorDokm = kmPecorrido*0.20;
			System.out.println("O valor de dias de aluguel " +totatalDiaria);
			System.out.println("Valor por km pecorrido " +valorDokm);
		}else if(aluguel == 1 && kmPecorrido > 100) {
			totatalDiaria = carroPopular*diasAlugado;
			valorDokm = kmPecorrido*0.10;
			System.out.println("O valor de dias de aluguel " +totatalDiaria);
			System.out.println("Valor por km pecorrido " +valorDokm);
		}else if(aluguel == 2 && kmPecorrido <=200) {
			totatalDiaria = carroLuxo*diasAlugado;
			valorDokm = kmPecorrido*0.30;
			System.out.println("O valor de dias de aluguel " +totatalDiaria);
			System.out.println("Valor por km pecorrido " +valorDokm);
		}else if(aluguel == 2 && kmPecorrido >200) {
			totatalDiaria = carroLuxo*diasAlugado;
			valorDokm = kmPecorrido*0.25;
			System.out.println("O valor de dias de aluguel " +totatalDiaria);
			System.out.println("Valor por km pecorrido " +valorDokm);
		}else {
			System.out.println("Opção invalida!");
		}
		
	}

}
