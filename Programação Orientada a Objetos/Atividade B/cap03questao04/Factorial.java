package cap03questao04;

public class Factorial {
	public static void main(String[] args) {
		int factorial = 1;
		
		System.out.println("O fatorial de 0 é = " + factorial);
		
		for (int n = 1; n <= 10; n++){
			System.out.println("O fatorial de " + n + " é ("+ (n -1)+ "!) * " + n + " = " + factorial * n );
			factorial = factorial * n;
			
		}
		
		
	}

}
