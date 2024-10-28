package exe0087;

public class FuncaoSimples {

	 public String nome;
	 
	 
	 public void gerador( String mensagem) {
	    int tamanha = mensagem.length()+12;
	    String linha  = "+";
	
	    for (int i = 0; i < tamanha; i++) {
			if(i < 7 || i >= tamanha - 7) {
				linha +="-";
			}else {
				linha += "=";
			}
		}
	    linha += "+";
	    System.out.println(linha); System.out.println("+ " + mensagem + " +"); System.out.println(linha);
	}
	 
}
