package cap04;

import javax.swing.JOptionPane;

public class RetirandoEspacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = JOptionPane.showInputDialog("Forne�a uma frase: ");
		frase = "      " + frase + "      ";
		JOptionPane.showMessageDialog(null, "\nCom espa�os: " + "-" + frase + "-"
				+ "\nSem espa�os: " + "-" + frase.trim() + "-");

		System.exit(0);
	}

}
