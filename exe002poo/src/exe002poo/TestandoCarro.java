package exe002poo;

import java.util.Scanner;

public class TestandoCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Carro cr = new Carro("Argo", "Fiat", 2024, 60, true);
		
		System.out.print("Digite a velocidade atual do carro :");
		double velocidade = sc.nextDouble();
		System.out.print("Deseja acelerar o carro ");
		double acelerar = sc.nextDouble();
		System.out.print("O carro reduziu a velocidade : ");
		double freiou = sc.nextDouble();
		
	    cr.setVelocidade(velocidade);
	    System.out.println("Ano do carro :" + cr.getAnoCarro());
	    System.out.println("Modelo :" + cr.getModelo());
	    System.out.println("Nome do Carro : " +cr.getNome());
	    System.out.println("Velocidade atual do carro " +velocidade);
	    
	    
	    cr.acelerar(acelerar);
	    System.out.println("O carro acelerou " +acelerar + "Km/h - Velocidade atual :" +cr.getVelocidade() + "Km/h");
	    
	    
	    cr.freiar(freiou);
	    System.out.println("O carro reduziu a velocidade para :" +cr.getVelocidade() + "Km/h");
	    
	    
	   
      
      
		
	}

}
