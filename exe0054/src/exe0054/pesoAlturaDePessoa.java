package exe0054;

import java.util.Scanner;

public class pesoAlturaDePessoa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double mediaGrupo = 0;
		int pessoaComNoventa = 0;
		int menorPesoAltura= 0;
		int maiorPesoAltura= 0;
		double somaAltura = 0;
		
		int pessoa []= new int [2];
		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("Digite seu peso :");
			float peso = sc.nextFloat();
			System.out.println("Digite sua altura ;");
			float altura = sc.nextFloat();
			
			 somaAltura+=altura;
			
			if(peso > 90) {
				pessoaComNoventa++;
			}else if(peso < 50 && altura < 1.60) {
				menorPesoAltura++;
			}
			if(altura > 1.90 && peso >100 ) {
				maiorPesoAltura++;
			}
			mediaGrupo = somaAltura/2;
		}

		System.out.println("Pessoa com mais de noventa: " +pessoaComNoventa);
		System.out.println("Pessoa com menos 50 kg e menor altura 1,60m: " +menorPesoAltura);
		System.out.println("Media da altura do grupo : " +mediaGrupo);
		System.out.println("Altura maior 1,90m e mais de 100 kg :" +maiorPesoAltura);
	}

}
