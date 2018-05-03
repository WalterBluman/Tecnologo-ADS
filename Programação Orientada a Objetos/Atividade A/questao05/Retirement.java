package questao05;

import javax.swing.JOptionPane;

public class Retirement {
	public static void main(String[] args) {
		String sex, aux;
		int age, contribution, necessaryTime;
		
		aux = JOptionPane.showInputDialog("Idade: ");
		age = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Tempo de contribuição: ");
		contribution = Integer.parseInt(aux);
		
		sex = JOptionPane.showInputDialog("Sexo(F/M): ");
		
		if (sex == "F"){
			if (age >= 60 || contribution >= 30 ){
				JOptionPane.showMessageDialog(null, "você já tem o direito a aposentadoria");
			}else{
				necessaryTime = Math.min((60 - age), (30 - contribution));
				JOptionPane.showMessageDialog(null, "Faltam " + necessaryTime + " anos para sua aposentadoria.");
			}
		}else{
			if (age >= 65 || contribution >= 35 ){
				JOptionPane.showMessageDialog(null, "você já tem o direito a aposentadoria");
			}else{
				necessaryTime = Math.min((65 - age), (35 - contribution));
				JOptionPane.showMessageDialog(null, "Faltam " + necessaryTime + " anos para sua aposentadoria.");
			}
		}
	}
}
