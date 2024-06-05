import java.util.Scanner;

public class condicionalNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero");
		num = sc.nextInt();
		if (num < 0 ) {
			System.out.println("O número " + num + " é negativo");
		}else {
			System.out.println("O número " + num + " é positivo");
		}
		
		
	}

}
