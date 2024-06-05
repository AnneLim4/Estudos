import java.util.Random;
import java.util.Scanner;


public class jogoForca {

	public static void main(String[] args) {
		String caracteres = "abcdefghijklmnopqrstuvwxyz";
		int compPalavra = 8;
		Random random = new Random();
		StringBuilder palavra = new StringBuilder(compPalavra);
		for (int i = 0; i < compPalavra; i++) {
			char c = caracteres.charAt(random.nextInt(caracteres.length()));
			palavra.append(c);
		}
		
		System.out.println(palavra.toString());
	}

}
