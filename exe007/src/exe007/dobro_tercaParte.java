package exe007;

import java.util.Scanner;

public class dobro_tercaParte {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero :");
	    double numero = sc.nextDouble();
	    
	    double dobro = numero*2;
	    double tercaParte = numero/3;
	    
	    System.out.println("O dobro do numero : "+dobro);
	    System.out.println("Terça parte do  numero : "+tercaParte);
		

	}

}
