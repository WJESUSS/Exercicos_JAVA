package exe075;

public class vetorFiboncce {

	public static void main(String[] args) {

		int[] fibonnaci = new int[16];
		fibonnaci[0] = 1;
		fibonnaci[1] = 1;

		for (int i = 2; i < fibonnaci.length; i++) {
			fibonnaci[i] = fibonnaci[i - 1] + fibonnaci[i - 2];

		}
		System.out.println("Sequência de fibonacci");
		for (int i : fibonnaci) {
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.println("O indice :");
		for (int i = 0; i < fibonnaci.length; i++) {
			System.out.print(" " + i);
		}
	}
}
