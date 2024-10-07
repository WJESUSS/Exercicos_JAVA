package exe0034;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu altura :");
		double altura = sc.nextDouble();
		System.out.println("Digite seu peso:");
		double peso = sc.nextDouble();
		
       double imc = peso/(altura*altura);
       
       if(imc <= 18.5) {
    	   System.out.println("Abaixo do peso");
       }else if(imc > 18.5 && imc < 25) {
    	   System.out.println("Peso ideal");
       }else if(imc >25 && imc < 30) {
    	   System.out.println(" Sobrepeso");
       }else if(imc > 30&& imc < 40) {
    	   System.out.println("Obesidade");
       }else {
    	   System.out.println("Obseidade mórbida");
       }
	}

}
