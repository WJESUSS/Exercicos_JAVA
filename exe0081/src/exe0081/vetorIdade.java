package exe0081;

import java.util.Scanner;

public class vetorIdade {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] idades = new int[8];
	        int somaIdades = 0;
	        int maiorIdade = 0;

	        for (int i = 0; i < 8; i++) {
	            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
	            idades[i] = scanner.nextInt();
	            somaIdades += idades[i];
	            if (idades[i] > maiorIdade) {
	                maiorIdade = idades[i];
	            }
	        }

	        double mediaIdade = (double) somaIdades / idades.length;

	        System.out.println("A média de idade é: " + mediaIdade);

	        System.out.println("Posições com pessoas com mais de 25 anos:");
	        for (int i = 0; i < idades.length; i++) {
	            if (idades[i] > 25) {
	                System.out.println("Posição " + i + ": " + idades[i]);
	            }
	        }

	        System.out.println("A maior idade digitada foi: " + maiorIdade);

	        System.out.println("Posições em que a maior idade foi digitada:");
	        for (int i = 0; i < idades.length; i++) {
	            if (idades[i] == maiorIdade) {
	                System.out.println("Posição " + i);
	            }
	        }

	        scanner.close();
	    }
	}
