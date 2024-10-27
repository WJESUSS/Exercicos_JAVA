package exe0070;


import java.util.Scanner;

public class vetorExe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int [] vetorB = new int [vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor A da posição :" +i+ " = ");
			vetorA[i]=sc.nextInt();
			
			vetorB[i]=vetorA[i]*2;
		}
		
		System.out.println("Vamos imprir a multiplicacão do vetor A :");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " +vetorA[i]);
		}
		System.out.println();
		System.out.println("Vamos imprir a multiplicacão do vetor B :");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(" "+ vetorB[i]);
		}
		System.out.println();
	}

}
