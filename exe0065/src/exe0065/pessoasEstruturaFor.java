package exe0065;

import java.util.Scanner;

public class pessoasEstruturaFor {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	char sexo;
	float peso;
	int mulheresCadastradas = 0;
	int homensMais100 = 0;
	int maiorPesoHomem=0;
	int somaPesoMulheres = 0;
	double mediaPesoMulheres =0;

	
	int pessoa [] = new int[8];
	
	for(int i=0;i<pessoa.length;i++) {
		System.out.print("Digite o sexo : M-masculino , F-Femenino :");
		sexo=sc.next().toUpperCase().charAt(0);
		System.out.print("Digite seu peso :");
		peso = sc.nextFloat();
		
		if(sexo =='F') {
			mulheresCadastradas++;
			somaPesoMulheres+=peso;
		}else if(sexo=='M')
		if( peso>=100) {
		 homensMais100++; 
	
		}
		if(sexo=='M' && peso>maiorPesoHomem) {
			maiorPesoHomem = (int) peso;

		}

		
		
	 mediaPesoMulheres = mulheresCadastradas > 0 ? (double) somaPesoMulheres / mulheresCadastradas : 0;
		
	}
	System.out.println("Mulhueres cadastrada " +mulheresCadastradas);
	System.out.println("Homens com mais 100kg :" +homensMais100);
	System.out.println("Media de peso mulhueres :" +mediaPesoMulheres);
	System.out.println("Maior peso entre os homens :" +maiorPesoHomem);
	}
	


}
