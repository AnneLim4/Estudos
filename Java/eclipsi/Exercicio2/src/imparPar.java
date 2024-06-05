import java.util.Scanner;

public class imparPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int a = sc.nextInt();
		double div = a / 2;
		if (a % 2 == 0) {
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
		
		sc.close();
		
	}

}
