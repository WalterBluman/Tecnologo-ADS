package cap03questao06;

public class Fibonacci {
	public static void main(String[] args) {
		int penultimate = 0, last = 1, next = 0;
		
		System.out.print(penultimate + ", " + last + ", ");
		while (next < 100){
			next = last + penultimate;
			penultimate = last;
			last = next;
			System.out.print(next + ", ");
		}
		
		
	}

}
