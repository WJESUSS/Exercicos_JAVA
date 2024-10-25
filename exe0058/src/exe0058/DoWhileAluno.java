package exe0058;

import java.util.Scanner;

public class DoWhileAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		{
	        Scanner scanner = new Scanner(System.in);
	        int somaIdades = 0;
	        int contadorAlunos = 0;
	        int idade;

	     
	        do {
	            System.out.print("Digite a idade do aluno (999 para sair): ");
	            idade = scanner.nextInt();
	            if (idade != 999) {
	                somaIdades += idade;
	                contadorAlunos++;
	            }
	        } while (idade != 999);

	      
	        double mediaIdade = contadorAlunos > 0 ? (double) somaIdades / contadorAlunos : 0;

	        System.out.println("Total de alunos na turma: " + contadorAlunos);
	        System.out.printf("Média de idade do grupo:" +mediaIdade);
}
}
}