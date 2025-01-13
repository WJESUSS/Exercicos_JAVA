package Exercicio01;


import java.util.Scanner;

public class Correcao {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		numero nm = new numero();
		
     while(true) {
    	
    	 System.out.println("===============MENU=============");

    	 System.out.println(" 0 - Para encerrar ");
    	 System.out.println(" 1 - Ler");
    	 System.out.println(" 2 - Atribuir um numero ");
    	 
    	 int opc = sc.nextInt();
    	 if(opc == 0) {
    		 System.out.println("Programa encerrado ");
    		 break;
    	 }else if (opc == 1) {
    		System.out.println("\n\nValor atribuido  " + nm.getValor()+ "\n"  );
    	 }else if(opc == 2) {
    		 System.out.println("Forneça um novo valor ");
    		 float v = sc.nextFloat();
    		  nm.setValor(v);
    	 }
     }
     System.out.println("FIM");
     System.out.println("ATE A PROXIMA");
	}

}
