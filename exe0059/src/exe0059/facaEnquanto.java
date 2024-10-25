package exe0059;

import java.util.Scanner;

public class facaEnquanto {

	public static void main(String[] args) {
	
		Scanner sn = new Scanner(System.in);
		
		int numero = 0;
		
		do {
		  System.out.print(numero+ "-");
		  numero+=3;
		}while(numero <= 30);
			System.out.println("Acabou..!");
		}

	}


