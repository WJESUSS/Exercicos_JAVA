package exe0047;

import java.util.Scanner;

public class forMultiploCinquenta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroIncial = 500;
		int numeroFinal = 0;
		
		for (int i = numeroIncial; i >= numeroFinal; i-=50) {
			System.out.println("Descrecente multiplos de 50 = " +i);
		}

	}

}
