package exe0061;

import java.util.Scanner;



public class doWhileNumeros {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		int somaNumero = 0;
		char continuar;
		int menorValor = Integer.MAX_VALUE;
		int valoresPares = 0;
		int contador =0;
		
		
		
		do {
			System.out.print("Digite um numero :");
			int numero=sc.nextInt();
			somaNumero+=numero;
			contador++;
			
			if(numero < menorValor) {
				menorValor=numero;
			}
				if(numero%2==0) {
					valoresPares++;
				}
				
			
			System.out.print("Voce deseja continuar sim ou não ?");
			continuar = sc.next().toUpperCase().charAt(0);
		}while(continuar=='S');
		double mediaNumeros = somaNumero/contador;

		System.out.println("O menor numero  :" +menorValor);
		System.out.println("A somatoria entre os numeros :" +somaNumero);
		System.out.println("O valores que são pares :" +valoresPares);
		System.out.println("A media dos numeros digitado :" +mediaNumeros);
	}
	
}
