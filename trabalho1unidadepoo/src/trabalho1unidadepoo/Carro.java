package trabalho1unidadepoo;

import java.util.Random;

public class Carro {
 
	private int distancia;
	private char simbolo;
	
	
	public int getDistancia() {
		return distancia;
	}


	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}


	public char getSimbolo() {
		return simbolo;
	}


	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}


	public Carro(char simbolo) {
		this.distancia=0;
		this.simbolo = simbolo;
		
	
	}
	public void altualizarDistancia() {
		Random randon = new Random();
		
		int velocidade = randon.nextInt(3)+1;
		this.distancia+=velocidade;
		
	}
	public void imprimirCarro1() {
        System.out.println("#".repeat(this.distancia) + this.simbolo);
        System.out.println("-".repeat(this.distancia));
      
    }
	public void imprimirCarro2() {
        System.out.println("#".repeat(this.distancia) + this.simbolo);
        System.out.println("-".repeat(this.distancia));


	
	}
	
	
}
