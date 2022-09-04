package cap04;

import javax.swing.JOptionPane;

public class PedacosDaFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String frase = JOptionPane.showInputDialog("Forneça uma frase: ");
			JOptionPane.showMessageDialog(null, "Frase: " + frase
					+ "\n(0,2): " + frase.substring(0,2)
					+ "\n(3,8): " + frase.substring(0, 8)
					+ "\n(9,11): " + frase.substring(0, 11)
					+ "\n(12,14): " + frase.substring(12, 14));
		}catch (StringIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "A frase deve ter pelo menos 15 caracteres. \n" + e);
		}
		System.exit(0);

	}

}
