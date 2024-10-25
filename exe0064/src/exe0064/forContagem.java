package exe0064;

import java.util.Scanner;

public class forContagem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero=0;
		
		System.out.println("Digite um  numero :");
		numero = sc.nextInt();
		for(int i =0;i<=numero;i++) {
			System.out.println("A contagem até: "+i );
		}
System.out.println("FIM!");
	}

}
