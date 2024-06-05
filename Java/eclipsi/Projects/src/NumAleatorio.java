import java.util.Scanner;
import java.util.Random;

public class NumAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int chute;
		int rand = random.nextInt(100)+1; // gera um número aleatório entre 1 e 100
		
		System.out.println("Adivinhe o numero!");
		
		while (true) { // loop infinito
			System.out.print("Digite um número: ");
			chute = sc.nextInt();
		
			if (chute != rand) {
				System.out.println("Errou!");
			
				if (chute <= rand) {
					System.out.println("Chute baixo. Tente novamente");
				} else if (chute >= rand) {
					System.out.println("Chute Alto. Tente novamente");
				}
			
			} else {
				System.out.println("Acertou!!!");
				break; // interrompe o loop
			}
		}
		sc.close();
	}

}
