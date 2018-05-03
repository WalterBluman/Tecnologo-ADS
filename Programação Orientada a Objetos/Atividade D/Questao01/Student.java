package Questao01;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Student {
	
	public static void main(String[] args) {
		
		float[] grades = new float[5];
		float average = 0;
		
		for(int i = 1; i <= 5; i++){
			grades[i-1] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota " + i + ": "));
			average += grades[i-1];
		}
		
		System.out.println("Média: " + (average / 5));
		
		Arrays.sort(grades);
		for(int i = 4; i >= 0  ; i--){
			System.out.println(grades[i]);
			}

	}
}

