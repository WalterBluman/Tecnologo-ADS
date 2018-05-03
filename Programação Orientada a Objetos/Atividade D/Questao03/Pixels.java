package Questao03;

import java.util.Random;

public class Pixels {
	public static void main(String[] args) {
		int matriz[][] = new int [40][40];
		
		for(int i = 0; i < 40; i++){
			for(int n = 0; n < 40; n++){
				Random number = new Random();
				int num = number.nextInt(255);
				matriz[i][n] = num;
			}
		}
		
		for(int i = 0; i < 40; i++){
			for(int n = 0; n < 40; n++){
				System.out.print("Matriz [" + i + "][" + n + "]: " + matriz[i][n]);
			System.out.print("\n");
			}
		}
	}
}
