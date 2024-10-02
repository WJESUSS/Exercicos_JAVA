package exe008;

import java.util.Scanner;

public class km {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a distancia em metro:");
		double metro = sc.nextDouble();
		
		double km = metro/1000;
		double hm = metro/100;
		double dam = metro/10;
		double dm = metro*10;
		double dc = metro*100;
		double mm = metro*1000;
		
		
		
		System.out.println("A distancia em Km " +km);
		System.out.println("A distancia em hm " +hm);
		System.out.println("A distancia em dam " +dam);
		System.out.println("A distancia em dm " +dm);
		System.out.println("A distancia em dc " +dc);
		System.out.println("A distancia em mm " +mm);
		
	}

}
