package cap04;

import javax.swing.JOptionPane;

public class TransformacoesNaFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = JOptionPane.showInputDialog("Forne�a uma frase: ");
		
		JOptionPane.showMessageDialog(null, "Frase: " + frase
				+ "\nTodas em Mai�sculas: " + frase.toUpperCase()
				+ "\nTodas em Min�sculas: " + frase.toLowerCase());
		System.exit(0);

	}

}
