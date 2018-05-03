package cap03questao07;

import javax.swing.JOptionPane;

public class NewX {
	public static void main(String[] args) {
		String aux;
		int x;
		
		aux = JOptionPane.showInputDialog("Digite um valor inteiro: ");
		x = Integer.parseInt(aux);
		
		while (x >= 1){
			if (x == 1){
				break;
			}
			if (x % 2 == 0){
				x = x / 2;
				
			}else{
				x = 3 * x + 1;
			}
			System.out.print(x + ", ");						
		}
				
	}
}
