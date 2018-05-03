package cap03questao03;

public class Multiples {
	public static void main(String[] args) {
		int i = 1, multiple = 1;
		while((multiple + 3) <= 100){
			multiple = 3 * i;
			i += 1;
			System.out.println(multiple);
			
		}
	}

}
