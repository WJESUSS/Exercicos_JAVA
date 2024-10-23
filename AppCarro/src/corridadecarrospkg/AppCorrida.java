
package corridadecarrospkg;

public class AppCorrida {

	public static void main(String[] args) {
	
		int distanciaMaxima = 20;
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		
		rua(distanciaMaxima);
		System.out.println(c1.getCar());
		tracado(distanciaMaxima);
		System.out.println(c2.getCar());
		rua(distanciaMaxima);
		do {
			rua(distanciaMaxima);
			c1.pegandoVelo(c1.geraVelo());
			System.out.println(c1.getCar());
			tracado(distanciaMaxima);
			c2.pegandoVelo(c2.geraVelo());
			System.out.println(c2.getCar());
			rua(distanciaMaxima);	
		}while(distanciaMaxima>c1.getDistancia() && distanciaMaxima>c2.getDistancia());
		
		if(c1.getDistancia()==distanciaMaxima && c2.getDistancia()==distanciaMaxima || c1.getDistancia()==c2.getDistancia()) {
			System.out.println("Os Carros empataram");
		} else {
			if(c2.getDistancia()>=distanciaMaxima && c2.getDistancia()>c1.getDistancia()) {
				System.out.println("Carro 2 Ganhou!");
			} else {
				 if(c1.getDistancia()>=distanciaMaxima && c1.getDistancia()>c2.getDistancia()) {
					System.out.println("Carro 1 Ganhou!");						
				}
			}
		}
		
	}
	
	
	public static void rua(int distanciaM) {
		for(int i=0;i<distanciaM;i++) {
			System.out.print("_");
		}
		System.out.print("P____");
		System.out.println();
	}
	
	public static void tracado(int distanciaM) {
		for(int i=0;i<distanciaM/2;i++) {
			System.out.print(" -");
		}
		System.out.print(" - -");
		System.out.println();
	}
	
}
