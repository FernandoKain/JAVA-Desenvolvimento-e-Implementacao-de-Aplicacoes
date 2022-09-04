package cap04;

import javax.swing.JOptionPane;

public class RetirandoEspacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = JOptionPane.showInputDialog("Forneça uma frase: ");
		frase = "      " + frase + "      ";
		JOptionPane.showMessageDialog(null, "\nCom espaços: " + "-" + frase + "-"
				+ "\nSem espaços: " + "-" + frase.trim() + "-");

		System.exit(0);
	}

}
