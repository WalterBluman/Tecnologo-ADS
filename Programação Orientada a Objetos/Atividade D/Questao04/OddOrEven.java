package Questao04;

import java.util.Random;

public class OddOrEven {
	
	public static void main(String[] args) {
		int[] odd = new int[10];
		int[] even = new int[10];
		int cont_even = 0;
		int cont_odd = 0;
		
		for(int i = 0; i < 10; i++){
			Random number = new Random();
			int num = number.nextInt(19) + 1;
			
			if (num != 0 && num % 2 == 0){
				even[cont_even] = num;
				cont_even += 1;
			}else if(num != 0 && num % 2 != 0){
				odd[cont_odd] = num;
				cont_odd += 1;
			}
		}
		System.out.println("-- Pares:");
		for(int i = 0; i < cont_even; i++){
			System.out.print(even[i] + " ");
		}
		
		System.out.println("\n-- Ímpares:");
		for(int i = 0; i < cont_odd; i++){
			System.out.print(odd[i] + " ");
		}
		
	}

}
