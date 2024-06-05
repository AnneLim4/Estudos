package intNumber;
import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("Multiplos entre si");
		}else {
			System.out.println("Não são multiplos");
			
		}
	}

}
