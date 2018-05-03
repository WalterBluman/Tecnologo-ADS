package Questao05;

import javax.swing.JOptionPane;

public class Parking {
	public static void main(String[] args) {
		String[] vacancies = new String[10];
		int option, index;
		String licensePlate = "", situation = "" ;
		
		
		do{
			option = Integer.parseInt(JOptionPane.showInputDialog("1. Entrada\n2. Saída\n3. Listar situação atual\n4. Encerrar"));
			switch (option) {
			case 1:
				index = Integer.parseInt(JOptionPane.showInputDialog("Número da vaga: "));
				licensePlate = JOptionPane.showInputDialog("Placa do carro: ");
				vacancies[index] = licensePlate;
				break;
			case 2:
				index = Integer.parseInt(JOptionPane.showInputDialog("Número da vaga: "));
				vacancies[index] = "";
				break;
			case 3:
				for(int i = 0; i < 10; i++){
					if (vacancies[i] != null){
						situation += "Vaga " + i + ": " + vacancies[i];
					}else {
						situation += "Vaga " + i + ": Disponível";
					}	
					situation += "\n";
				}
				JOptionPane.showMessageDialog(null, "Situação atual: \n" + situation);
				break;
			case 4:
				break;
			default:
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!!");
				break;
			}
	
		}while(option != 4);
		
	}

}
