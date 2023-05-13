import java.util.Scanner;

public class biblioteca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int escolha = 1;
		System.out.println("Escolha oque quer fazer");
		System.out.println("1.Escolher um livro");
		System.out.println("2.Adicionar um livro");
		System.out.println("3.Pesquisar um livro");
		
		switch (escolha) {
			case 1:
				System.out.println("Escolha um numero de 0 a 3, para indicar o livro.");
				n = sc.nextInt();
				String[]boks = {"O pequeno principe", "Em Busca do Tempo Perdido","Dom Quixote","Moby Dick"};
				System.out.println(boks[n]);
			break;
			
			case 2:
				System.out.println("2.Adicionar um livro");
			break;
			
			case 3:
				System.out.println("3.Pesquisar um livro");
			break;
		}
		
		
		
		
		sc.close();
	}

}
