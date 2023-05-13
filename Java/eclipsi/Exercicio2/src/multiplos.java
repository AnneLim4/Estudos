import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, b;
		System.out.println("Digite um numero");
		a = sc.nextInt();
		System.out.println("Digite mais um numero");
		b = sc.nextInt();
		if (a % b == 0 || b % a == 0) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		
		
		sc.close();
	}

}
