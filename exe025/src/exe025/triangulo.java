package exe025;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Digite o lado A do triangulo:");
		int ladoA = sc.nextInt();
		System.out.print("Digite o lado B do triangulo:");
		int ladoB = sc.nextInt();
		System.out.print("Digite o lado C do triangulo:");
        int ladoC =sc.nextInt();
        
        if(ladoA<ladoB + ladoC && ladoB<ladoA + ladoC & ladoC<ladoA + ladoB) {
        	System.out.println("É um triangulo");
        }else {
        	System.out.println("Não é um triangulo ");
        }
	}

}
