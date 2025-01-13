package Exercicio01;

public class numero {

	private float valor;
	
	
	public  numero() {
		this.valor = 0;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		if(valor < 0) {
			valor = 0;
			System.out.println("Valor menor que 0 > Corrigindo para 0");
			
			}else if(valor > 40 && valor < 60) {
			if(valor < 50) {
			valor = 40;
			System.out.println("Valor de intervalo não suportado > corrigindo para 40");
		}else {
		valor = 60;
			System.out.println("Valor de intervalo não suportado > corrigindo para 60");
		}
	}
	else if(valor > 100) {
		valor = 100;
		System.out.println("Valor maior que 100 --> valor corrigido 100");
	}
	this.valor = valor;
	System.out.println("Novo valor atribuido ");
}
}
