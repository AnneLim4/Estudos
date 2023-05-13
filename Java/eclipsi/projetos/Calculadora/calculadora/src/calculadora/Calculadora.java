package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double num1, num2, resultado;
		String sinal;
		
		
		System.out.println("digite um número");
		 num1 = sc.nextInt();
		System.out.println(num1);
		
		System.out.println("digite o segundo número");
		num2 = sc.nextInt();
		System.out.println(num2);
		
		System.out.println("digite o sinal da operação: +, -, *, /.");
		sinal = sc.next();
		
		resultado = 0;
		
		switch (sinal) {
			case "+":
				resultado = num1 + num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			case "*":
				resultado = num1 * num2;
				break;
			case "/":
				resultado = num1 / num2;
				break;
			default:
				System.out.println("Invalido!");
				break;
		}
		
		System.out.println("O resultado é: " + resultado);
	
	}

}
