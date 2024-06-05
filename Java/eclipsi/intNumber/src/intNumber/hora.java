package intNumber;
import java.util.Scanner;


public class hora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo do horario do jogo:");
		
		
		System.out.println("Digite a hora de inicio");
		int horaInicio = sc.nextInt();
		System.out.println("Digite a hora do fim de jogo");
		int horaFim = sc.nextInt();
		
		// Conversão de horas para minutos
		int minInicio = horaInicio * 60;
		int minFim = horaFim * 60;
		
		// adiciona 24 horas se a hora do fim for menor que a hora de inicio
		if (minFim <= minInicio) {
			minFim += 1440;
		}
		
		int duracao = minFim - minInicio;
		//Converte os minutos em horas
		int duracaoHoras = duracao / 60;
		
		System.out.println("O jogo durou " + duracaoHoras + "Hora(s)");
		sc.close();
	}

}
