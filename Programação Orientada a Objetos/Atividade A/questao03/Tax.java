package questao03;

import javax.swing.JOptionPane;

public class Tax {
	public static void main(String[] args) {
		String aux;
		float transactionValue, venalValue, percent, percentTax;
		
		aux = JOptionPane.showInputDialog("Valor da transação: ");
		transactionValue = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Valor venal: ");
		venalValue = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Percentual de imposto: ");
		percent = Float.parseFloat(aux);
		
		if (transactionValue > venalValue){
			percentTax = transactionValue * percent/100;
		}else{
			percentTax = venalValue * percent/100;
		}
		
		JOptionPane.showMessageDialog(null, "Valor do imposto a ser pago: " + percentTax);
	}
}
