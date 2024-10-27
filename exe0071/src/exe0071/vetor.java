package exe0071;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	        int[] vetor1 = new int[8];
	        int[] vetor2 = new int[8];

	   
	        for (int i = 0; i < vetor1.length; i++) {
	            vetor1[i] = 999;
	            vetor2[i] = i;
	        }


	        System.out.println("Vetor 1:");
	        for (int i : vetor1) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        System.out.println("Vetor 2:");
	        for (int i : vetor2) {
	            System.out.print(i + " ");
	        }
	        
		}
	}