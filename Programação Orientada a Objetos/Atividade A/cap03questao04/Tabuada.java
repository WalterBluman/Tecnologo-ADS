package cap03questao04;

import javax.swing.JOptionPane;

public class Tabuada {
	public static void main(String[] args) {
		int number, result; 
		String answers = "";
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		for (int i = 1; i <= 10; i++){
			result = number * i;
			answers += number + " x " + i + " = " + result + "\n";
		}
		
		JOptionPane.showMessageDialog(null, answers);
		
	}
}
