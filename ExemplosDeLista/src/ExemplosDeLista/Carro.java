package ExemplosDeLista;

public class Carro {

	private String marca;
	private int ano;
	private String cor;
	private double preco;
	
	

	
	public Carro(String marca, int ano, String cor, double preco) {
		super();
		this.marca = marca;
		this.ano = ano;
		this.cor = cor;
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String toString() {
		return "Marca : " +marca + " Cor :" +cor+ " Ano :"+ano + " Preço : "+preco;
		
	}
	
}
