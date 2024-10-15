package exe0050;

import java.util.Random;
import java.util.Scanner;

public class sorteioNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		Random random = new Random();
		int numero []= new int[20];
		
		int acimaDeCinco =0;
		int divisoresPorTres =0;
		
        System.out.println("Número sorteado :");
		for (int i = 0; i < 20; i++) {
			numero[i] = random.nextInt(11);
			System.out.print(numero[i]+ " ");
			
			
			if(numero[i] > 5) {
				acimaDeCinco++;
			} 
			if(numero[i]%3==0)
			divisoresPorTres++;
		}
	
		System.out.println("/nQuantidades de numero que estão acima de 5 =  "+acimaDeCinco);
		System.out.println("Quantidade de numeros divisivo por  3 = " +divisoresPorTres);
	}



}
