package exe002poo;

public class Carro {

	private String nome;
	private String modelo;
	private int anoCarro;
	private double velocidade;
	private boolean ligado;
	
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public Carro() {
	
	}
	public Carro(String nome, String modelo, int anoCarro, double velocidade ,boolean ligado) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.anoCarro = anoCarro;
		this.velocidade = 0;
		this.ligado = ligado;
	}
	
	public void acelerar(double velo) {
		if(this.ligado == true) {
			this.velocidade+= velo;
		}else {
			System.out.println("Carro desligado!");
		
		}
		
	}
	public void freiar(double reduzir) {
		velocidade-=reduzir;
	}
	public void buzinar() {
		System.out.println("bibibibibib");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoCarro() {
		return anoCarro;
	}

	public void setAnoCarro(int anoCarro) {
		this.anoCarro = anoCarro;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {

		this.velocidade = velocidade;
	}
	
	
}
