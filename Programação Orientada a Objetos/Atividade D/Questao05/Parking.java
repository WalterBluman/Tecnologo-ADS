package Questao05;

import javax.swing.JOptionPane;

public class Parking {
	public static void main(String[] args) {
		String[] vacancies = new String[10];
		int option, index;
		String licensePlate = "", situation = "" ;
		
		
		do{
			option = Integer.parseInt(JOptionPane.showInputDialog("1. Entrada\n2. Sa�da\n3. Listar situa��o atual\n4. Encerrar"));
			switch (option) {
			case 1:
				index = Integer.parseInt(JOptionPane.showInputDialog("N�mero da vaga: "));
				licensePlate = JOptionPane.showInputDialog("Placa do carro: ");
				vacancies[index] = licensePlate;
				break;
			case 2:
				index = Integer.parseInt(JOptionPane.showInputDialog("N�mero da vaga: "));
				vacancies[index] = "";
				break;
			case 3:
				for(int i = 0; i < 10; i++){
					if (vacancies[i] != null){
						situation += "Vaga " + i + ": " + vacancies[i];
					}else {
						situation += "Vaga " + i + ": Dispon�vel";
					}	
					situation += "\n";
				}
				JOptionPane.showMessageDialog(null, "Situa��o atual: \n" + situation);
				break;
			case 4:
				break;
			default:
				JOptionPane.showMessageDialog(null, "OP��O INV�LIDA!!");
				break;
			}
	
		}while(option != 4);
		
	}

}
