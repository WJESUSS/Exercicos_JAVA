package exe0010;

import java.util.Scanner;

public class largura_altura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura da parede: ");
		float altura = sc.nextFloat();
		System.out.println("Digite a largura da parede: ");
		float largura = sc.nextFloat();
 
		float area = altura*largura;
		
		float qtaTinta = area*2;
		
		System.out.println("A area da parede é de "+area+ " e a quantidade de tinta a ser usada é "+qtaTinta);
	}

}
