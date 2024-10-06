package exe0023;

import java.util.Scanner;

public class descontoMulheres {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Digite seu nome :");
		String nome = sc.nextLine();
		
		System.out.println("Informe o sexo 1-Homem ,2-mulher:");
		int sexo = sc.nextInt();
		
		System.out.println("Informe o valor da compra: ");
		double valorComprar = sc.nextDouble();
		
	    if(sexo==1) {
	    	double desconto = valorComprar*0.05;
	    	double valorTotal = valorComprar-desconto;
	    	System.out.println("O valor do desconto para o homem " + desconto+ " valor total da compra "+valorTotal);
	    }else if(sexo==2) {
	    	
	    	double desconto = valorComprar*0.13;
	    	double valorTotal = valorComprar-desconto;
	    	System.out.println("O valor do desconto para as mulheres é " + desconto +  " valor total da compra "+valorTotal);
	    }else {
	    	System.out.println("Opção invalida,tente novamente!");
	    }

	}

}
