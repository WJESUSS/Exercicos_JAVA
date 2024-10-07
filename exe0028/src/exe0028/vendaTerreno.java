package exe0028;

import java.util.Scanner;

public class vendaTerreno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno ");
		double largura = sc.nextDouble();
		System.out.print("Digite a comprimento do terreno ");
		double comprimento = sc.nextDouble();
		
		double area = comprimento*largura;
		
		if(area < 100) {
			System.out.println("Terreno polpular");
		}else if( area >=100 && area < 500) {
			System.out.println("Terreno master ");
		}else {
		System.out.println("Terreno vip ");
	}

}
}
