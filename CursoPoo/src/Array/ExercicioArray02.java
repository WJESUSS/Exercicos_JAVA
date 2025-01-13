package Array;


import java.util.Scanner;

public class ExercicioArray02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		n = sc.nextInt();
		String produto [] = new String [n];
		double preco [] = new double [n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o valor do produto ");
			preco[i] = sc.nextInt();
			System.out.println("===============================");
			
		}
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome do produto ");
			produto[i] =sc.nextLine();
			System.out.println("===============================");
		}
		
	for (int i = 0; i < n; i++) {
		System.out.println(" Produto : " + produto[i] + "\n Valor :" +preco[i]);
	}
	System.out.println("===============================");
		double somaValor = 0;
		for (int i = 0; i < n; i++) {
			somaValor +=preco[i];
			
		}
		System.out.println("Valor total dos produtos : " +somaValor);
		System.out.println("===============================");
	
		double mediaValor = somaValor/n;
		System.out.println("A media preco dos produto é " + mediaValor);
		System.out.println("===============================");
	

}
}
