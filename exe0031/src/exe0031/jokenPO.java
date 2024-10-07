package exe0031;

import java.util.Random;
import java.util.Scanner;

public class jokenPO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
	
        
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        
        System.out.println("Escolha: \n0 - Pedra\n1 - Papel\n2 - Tesoura");
        System.out.print("Sua escolha: ");
        int escolhaJogador = sc.nextInt();
        
        int escolhaComputador = random.nextInt(3);
        
        System.out.println("Você escolheu: " + opcoes[escolhaJogador]);
        System.out.println("O computador escolheu: " + opcoes[escolhaComputador]);
        
        if (escolhaJogador == escolhaComputador) {
            System.out.println("Empate!");
        } else if ((escolhaJogador == 0 && escolhaComputador == 2) ||
                   (escolhaJogador == 1 && escolhaComputador == 0) ||
                   (escolhaJogador == 2 && escolhaComputador == 1)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Computador venceu!");
        }
        
        sc.close();
    }
}

