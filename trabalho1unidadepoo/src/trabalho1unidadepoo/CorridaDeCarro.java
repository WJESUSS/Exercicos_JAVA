package trabalho1unidadepoo;

public class CorridaDeCarro {

	public static void main(String[] args) {
		
		final int DISTANCIA_MAXIMA =20;
		

		Carro carro1 = new Carro('1');
		Carro carro2 = new Carro('2');
		
	
		while(carro1.getDistancia() <= DISTANCIA_MAXIMA && carro2.getDistancia() <= DISTANCIA_MAXIMA){
			carro1.altualizarDistancia();
			carro2.altualizarDistancia();
			
			carro1.imprimirCarro1();
			carro2.imprimirCarro2();
			
			System.out.println();
			
		}
		determinarVencedor(carro1, carro2, DISTANCIA_MAXIMA);
		    }
	
	
	public static void determinarVencedor(Carro carro1, Carro carro2, int distanciaMaxima) {
		int distancia1 = carro1.getDistancia();
		int distancia2 = carro2.getDistancia();
		
		if (distancia1 >= distanciaMaxima && distancia2 >= distanciaMaxima) {
			if (distancia1 > distancia2) {
				System.out.println("Veículo 1 venceu!");
			} else if (distancia2 > distancia1) {
				System.out.println("Veículo 2 venceu!");
			} else {
				System.out.println("Empate!");
			}
		} else if (distancia1 >= distanciaMaxima) {
			System.out.println("Veículo 1 venceu!");
		} else {
			System.out.println("Veículo 2 venceu!");
		}
		}
	}


