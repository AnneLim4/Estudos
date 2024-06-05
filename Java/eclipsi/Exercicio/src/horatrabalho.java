import java.util.Scanner;
import java.util.Locale;

public class horatrabalho {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFuncio, valorHora;
		double	salario, horaTrabalho;
		
		System.out.println("Qual o seu número de identificação?");
		numFuncio = sc.nextInt();
		System.out.println("Qual o valor da sua hora trabalhada?");
		valorHora = sc.nextInt();
		System.out.println("Quantas horas você trabalha");
		horaTrabalho = sc.nextDouble();
		
		
		salario = horaTrabalho * valorHora;
		System.out.println("Employee number = "+ numFuncio);
		System.out.printf("Employee salary = U$ %.2f%n", salario);
		
		sc.close();
	}

}
