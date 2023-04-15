import java.util.Scanner;

public class diferenca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, dife;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dife = (A* B-C *D);
		System.out.println(dife);
		
		sc.close();
	}

}
