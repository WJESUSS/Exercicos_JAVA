package exe0033;

import java.util.Scanner;

public class compraImovel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do imovel ");
		double valorImovel = sc.nextDouble();
		System.out.println("Salario do comprador  ");
		double salario = sc.nextDouble();
		System.out.println("Em quantos anos pagará o imovel  ");
		int anosPgando = sc.nextInt();
		
	   int mes = anosPgando*12;
	   double prestacaoMensal = valorImovel/mes ;
	   double limitePrestacao = salario*0.30;
	   
	   if(prestacaoMensal <= limitePrestacao) {
		   System.out.println("O limite será aprovado !");
	   }else {
		   System.out.println("Infelizmente seu limite não poderá ser aprovador,exedeu 30% salario");
	   }
		
		

	}

}
