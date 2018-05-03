package questao02;

import java.util.Scanner;

public class Championship {
	public static void main(String[] args) {
		int leaderPoints, anotherTeam, victories;
		Scanner sc;
		
		System.out.println("Pontos do líder do campeonato: ");
		sc = new Scanner(System.in);
		leaderPoints = sc.nextInt();
		
		System.out.println("Pontos do time lanterna: ");
		sc = new Scanner(System.in);
		anotherTeam = sc.nextInt();
		
		victories = (leaderPoints - anotherTeam)/3;
		System.out.println("Serão necessárias " + victories + " vitórias para que o time lanterna alcance/ultrapasse o líder.");
		
	}
}
