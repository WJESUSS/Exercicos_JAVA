package exe0053;
import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        
        int homens = 0;
        int mulheres = 0;
        int somaIdades = 0;
        int somaIdadesHomens = 0;
        int mulheresMaisDeVinte = 0;

        for (int i = 1; i < 6; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o sexo da " + i + "ª pessoa (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            
            somaIdades += idade;

            if (sexo == 'M') {
                homens++;
                somaIdadesHomens += idade;
            } else if (sexo == 'F') {
                mulheres++;
                if (idade > 20) {
                    mulheresMaisDeVinte++;
                }
            }
        }

        double mediaIdadeGrupo = (double) somaIdades / 5;
        double mediaIdadeHomens = homens != 0 ? (double) somaIdadesHomens / homens : 0;

        System.out.println("\nResultado:");
        System.out.println("a) Homens cadastrados: " + homens);
        System.out.println("b) Mulheres cadastradas: " + mulheres);
        System.out.printf("c) Média de idade do grupo: %.2f\n", mediaIdadeGrupo);
        System.out.printf("d) Média de idade dos homens: %.2f\n", mediaIdadeHomens);
        System.out.println("e) Mulheres com mais de 20 anos: " + mulheresMaisDeVinte);

        scanner.close();
    }
}