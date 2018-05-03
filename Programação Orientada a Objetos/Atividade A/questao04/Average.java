package questao04;

import javax.swing.JOptionPane;

public class Average {
	public static void main(String[] args) {
		String aux;
		float note1,  note2, work, average;
		
		aux = JOptionPane.showInputDialog("Nota 1: ");
		note1 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Nota 2: ");
		note2 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Trabalho: ");
		work = Float.parseFloat(aux);
		
		average = (note1 + note2 + work)/3;
		
		if (average >= 6){
			JOptionPane.showMessageDialog(null, "APROVADO!! Média = " + average);
		}else{
			JOptionPane.showMessageDialog(null, "REPROVADO!! Média = " + average);
		}
		
	}
}
