package exe0074;

public class VetorIndice {

	public static void main(String[] args) {
		
		int []vetorA = new int[10];
		int []vetorB = new int [10];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] =  (i % 2 == 0) ? 5 : 3;
		}

		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = i;
		}
		System.out.println();
		System.out.println("Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " +vetorA[i]);


	
			}
		System.out.println();
		System.out.println("Vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(" " +vetorB[i]);
			

		}
	}
	

}
