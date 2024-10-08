package exe0043;

import java.util.Scanner;

public class for_divisivo_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero :");
		int numero = sc.nextInt();
		
		for (int i = 30; i >= 0; i--) {
			
			if(i%4==0) {
				
				System.out.println("Os numero digitados : "+i);
			}
		}
		}
		

}
