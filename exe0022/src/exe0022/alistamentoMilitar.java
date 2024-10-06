package exe0022;

import java.util.Scanner;

public class alistamentoMilitar {

	public static void main(String[] args) {
	   
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento :");
		int ano = sc.nextInt();
		
	
		int anoAtual = 2024;
		int idade = anoAtual - ano;
		
	  if(idade < 18) {
		  int idadeParaAlistamento = 18-idade;
		  System.out.println("Falta " + idadeParaAlistamento + " anos para se alistar pois ele tem " +idade+ " anos");
	  }else if(idade==18) {
		  System.out.println("Voçê devera se alistar esse ano pois tem " +idade);
	  }else {
		  int idadePassada = idade-18;
		  System.out.println("Ele ja passou  " +idadePassada + " do alistamento pois tem " +idade+ " anos");
	  }
	}

}
