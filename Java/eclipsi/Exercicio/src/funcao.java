import java.util.Scanner;
import java.util.Locale;


public class funcao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double R, A, pi = 3.14159;

		R = sc.nextDouble();
		A = Math.pow(R, 2.0);
		System.out.printf("A=%.4f%n ", pi * A);
				
		sc.close();

	}

}
