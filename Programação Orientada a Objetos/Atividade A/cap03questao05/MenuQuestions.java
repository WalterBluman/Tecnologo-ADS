package cap03questao05;

import javax.swing.JOptionPane;

import cap03questao01.Product;
import cap03questao03.SystemAccess;
import cap03questao04.Tabuada;

public class MenuQuestions {
	public static void main(String[] args) {
		int option;
		
		option = Integer.parseInt(JOptionPane.showInputDialog("1 - 1� Quest�o\n3 - 3� Quest�o\n4 - 4� Quest�o"));
		
		switch (option) {
		case 1:
			Product.main(args);
			break;
		case 3:
			SystemAccess.main(args);
			break;
		case 4:
			Tabuada.main(args);
			break;
		default:
			JOptionPane.showMessageDialog(null, "OP��O INV�LIDA!!");
			break;
		}
	}
}
