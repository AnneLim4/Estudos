package intNumber;
import java.util.Scanner;


public class preço {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo;
		int quantidade;
		double total;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.5;
		}else if (codigo == 3) {
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			total = quantidade * 2.0;
		}else {
			total = quantidade * 1.50;
		}
		
		System.out.println(total);
		sc.close();
	}

}
