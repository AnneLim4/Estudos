import java.util.Scanner;
import java.util.Locale;

public class vendas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, qte1, qte2;
		double val1, val2, total;
		
		System.out.println("Digite o codigo do produto");
		cod1 = sc.nextInt();
		System.out.println("Digite o codigo do produto");
		cod2 = sc.nextInt();
		System.out.println("Digite quantos produto compra");
		qte1 = sc.nextInt();
		System.out.println("Digite quantos produto compra");
		qte2 = sc.nextInt();
		
		System.out.println("Digite o valor do produto");
		val1 = sc.nextDouble();
		System.out.println("Digite o valor do produto");
		val2 = sc.nextDouble();
		total = val1 * qte1 + val2 * qte2;
		
		System.out.printf("Valor apagar: %.2f%n", total);
		
		sc.close();
	}

}
