package exe0082;

import java.util.Scanner;

public class vetorAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double maiorNota=0;
		double mediaTurma = 0;
		double notaSoma =0;
		double notaAluno[] = new double[4];
		
		for (int i = 0; i < notaAluno.length; i++) {
			System.out.print("Digite a nota dos alunos:");
			notaAluno[i] = sc.nextDouble();
			notaSoma+=notaAluno[i];
			if(notaAluno[i] > maiorNota) {
				maiorNota = notaAluno[i];
		
		}
			}
		mediaTurma = notaSoma/notaAluno.length;
		System.out.println("A media da turma " +mediaTurma);
		
		int acimaMedia = 0;
	     for (int i = 0; i < notaAluno.length; i++) {
			    if(notaAluno[i]>mediaTurma) {
			    	acimaMedia++;
			    }
		}
	     System.out.println("Aluno acima da media " +acimaMedia);
	     System.out.println("A maior nota digitada foi: " + maiorNota);
	     System.out.println("Posições em que a maior nota foi digitada:" );
	     
	     for (int i = 0; i < notaAluno.length; i++) {
		if(notaAluno[i] == maiorNota) {
			System.out.print(" Posiçao "+i);
		}


	}
}
}