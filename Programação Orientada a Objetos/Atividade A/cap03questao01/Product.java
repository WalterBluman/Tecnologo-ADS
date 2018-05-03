package cap03questao01;

import javax.swing.JOptionPane;

public class Product {
	public static void main(String[] args) {
		String name, aux;
		int discount = 0;
		float newValue, value, discountValue;
		
		name = JOptionPane.showInputDialog("Nome do produto: ");
		
		aux = JOptionPane.showInputDialog("Valor do produto: ");
		value = Float.parseFloat(aux);
		
		if (value > 0){
			if (value < 200 && value >= 50){
				discount = 5;
			}
			
			if (value >= 200 && value < 500){
				discount = 6;
			}
			if (value >= 500 && value < 1000){
				discount = 7;
			}
			if (value >= 1000){
				discount = 8;
			}
		}else{
			JOptionPane.showMessageDialog(null, "Valor inválido!");
		}
		
		discountValue = (discount * value) / 100;
		newValue = value - discountValue;
		
		JOptionPane.showMessageDialog(null, "Produto: " + name + "\nValor original: " + value + "\nValor final: " + newValue);
		
	}

}
