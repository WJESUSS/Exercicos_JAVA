package exe0073;

public class VetorIndice {

	public static void main(String[] args) {
		
		int []vetorA = new int[10];
		int []vetorB = new int [10];
		
		
		for (int i = 0; i < vetorA.length; i++) {
		vetorA[i] = 9-i;
		}
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] =i;
			}

		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " +vetorA[i]);
		}
		System.out.println();
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(" " +vetorB[i]);
		}
	}

}
