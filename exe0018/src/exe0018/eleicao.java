package exe0018;

import java.util.Scanner;

public class eleicao {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento :");
		int anoNascimento = sc.nextInt();
		
		int anoAtual = 2024;
		int permicaoVotar = anoAtual-anoNascimento;
		
		if(permicaoVotar>18) {
			System.out.println("Ela podera votar");
		}else {
			System.out.println("Não é permitido votar");
		}

	}


}
