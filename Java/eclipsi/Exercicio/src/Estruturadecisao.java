import java.util.Scanner;


public class Estruturadecisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Digite a hora atual.");
		hora = sc.nextInt();
		if (hora >= 5 && hora <= 11) {
			System.out.println("Bom dia");
		}
		else if (hora >= 12 && hora <= 18) {
			System.out.println("Boa tarde");
			} else{
				System.out.println("Boa noite");
			}
		
		sc.close();
	}
	

}
