package cap03questao02;

public class Sum {
	public static void main(String[] args) {
		int i = 0, number = 0;
		while(i <= 1000){
			number += i;
			i += 1;
		}
		System.out.println(number);
	}
}
