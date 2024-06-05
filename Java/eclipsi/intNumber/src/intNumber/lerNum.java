package intNumber;
import java.util.Scanner;

public class lerNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite um numero");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Positivo");
		}
		
		
	}

}
