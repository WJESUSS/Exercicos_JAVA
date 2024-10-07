package exe0032;

import java.util.Random;
import java.util.Scanner;

public class jogoDeAdivinhação {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int [] opcao = {0,1,2,3,4};
		Random randon = new Random();
		
		System.out.println("Digite um número a ser adivinhado :");
		System.out.print("Qual é sua escolha :");
		int numero = sc.nextInt();
		int numeroSerAdivinhado = randon.nextInt(5);
		
		System.out.println("Escolha do jogador " +opcao[numero]);
		System.out.println("Escolhar do computador " +opcao[numeroSerAdivinhado]);
		
		
	 if(opcao[numero]==opcao[numeroSerAdivinhado]) {
		 System.out.println("Houve empate ");
	 }else if(opcao[numero]>opcao[numeroSerAdivinhado]) {
		 System.out.println("O jogador ganhou");
	 }else if(opcao[numero] < opcao[numeroSerAdivinhado]) {
		 System.out.println("O computador ganhou !");
	 }
		

	}

}
