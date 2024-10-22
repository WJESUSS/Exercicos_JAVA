package corridadecarrospkg;

import java.util.Random;

public class Carro {

	private int velocidade=0;
	private int distancia=0;
	private String carro = "#";
	
	public int getDistancia() {
		return this.distancia;
	}
	
	public void pegandoVelo(int velo) {
		this.velocidade = velo;
		this.distancia += velo;
		String finalCar = "";
		for(int i=1;i<=this.distancia;i++) {
			finalCar += "=";
		}
		finalCar += "#";
		this.carro = finalCar;
	}
	
	public String getCar() {
		return this.carro;
	}
	
	public int geraVelo() {
		Random rd = new Random();
		int velo=0;
		velo = rd.nextInt(1,3);
		return velo;
	}
	
}

