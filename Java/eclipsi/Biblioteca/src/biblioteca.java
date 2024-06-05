import java.util.Scanner;

public class biblioteca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] book =  {"O Grande Gatsby", "Dom Quixote", "Moby Dick", "Cem Anos de Solidão", "Orgulho e Preconceito", "O Apanhador no Campo de Centeio", "Guerra e Paz", "O Senhor dos Anéis", "Crime e Castigo", "O Velho e o Mar", "Ulisses", "O Conde de Monte Cristo", "O Retrato de Dorian Gray", "O Processo", "A Metamorfose", "O Som e a Fúria", "Em Busca do Tempo Perdido", "As Aventuras de Tom Sawyer", "A Revolução dos Bichos", "Harry Potter e a Pedra Filosofal"} ;
		
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
