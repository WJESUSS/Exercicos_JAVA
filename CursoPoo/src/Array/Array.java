package Array;


import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n ;
		
		System.out.println("O tamanha do vetor");
		n=sc.nextInt();
		
		
		 double[] altura = new double [n];
		
		for (int i = 0; i < n; i++) {
			altura[i] = sc.nextDouble();
		}
		double somaAltura = 0;
	for (int i = 0; i < n; i++) {
		somaAltura+=altura[i];
		System.out.println(+somaAltura);

	}
	double media = somaAltura/n;
	System.out.println("A media das altura " +media);
	}

}
