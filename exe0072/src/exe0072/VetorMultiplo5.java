package exe0072;

public class VetorMultiplo5 {

	public static void main(String[] args) {
		
		int []vetorA= new int[11];
		int []vetorB = new int [11];
		
		
		for (int i = 0; i < vetorA.length; i++) {
		vetorA[i] = i;
		vetorB[i] = vetorA[i]*5;
			
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("   "+vetorA[i]);
		} 

		System.out.println( );
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("  " +vetorB[i]);
			
		}
	}

}
