  package exe0030;

   import java.util.Scanner;

   public class TrianguloParte1 {

	public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);
		
		System.out.print("Digite o lado A do triangulo:");
		int ladoA = sc.nextInt();
		System.out.print("Digite o lado B do triangulo:");
		int ladoB = sc.nextInt();
		System.out.print("Digite o lado C do triangulo:");
        int ladoC =sc.nextInt();

      if(ladoA == ladoB && ladoB == ladoC && ladoA == ladoC) {
        	System.out.println("EQUILÁTERO");
        }else if(ladoA == ladoB || ladoA == ladoC ||ladoB == ladoC) {
        	System.out.println("ISÓSCELES");
        }else if(ladoA != ladoB && ladoB != ladoC && ladoA != ladoC){
        	System.out.println("ESCALENO");
        }
	}

}
