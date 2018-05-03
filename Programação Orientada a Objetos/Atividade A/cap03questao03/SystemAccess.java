package cap03questao03;

import javax.swing.JOptionPane;

public class SystemAccess {
	public static void main(String[] args) {
		final String defaultUser = "java8";
		
		for (int i = 2; i >= 0; i--){
			String user = JOptionPane.showInputDialog("Login: ");
			String password = JOptionPane.showInputDialog("Password: ");
			if (user.equals(defaultUser) && password.equals(defaultUser)){
				JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
				break;
			}else{
				if (i != 0){
					JOptionPane.showMessageDialog(null, "Falha, verifique login e senha.\n" + "Você tem " + i + " tentativas");
				}else{
					JOptionPane.showMessageDialog(null, "Suas tentativas acabaram!");
				}
			}
		}
	}
}
