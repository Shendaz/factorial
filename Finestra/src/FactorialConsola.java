import java.util.Scanner;

public class FactorialConsola {
	public static double factorial(double numero) {
		if (numero == 0) {
			return 1;
		} else {
			double resultat = numero * factorial(numero - 1);
			return resultat;
		}
	}

	public static void main(String[] args) {
	    	int numero;
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Introdueix el número : ");
		numero = scan.nextInt();
		System.out.println(factorial(numero));
	}
}
