package cap04;

import javax.swing.JOptionPane;

public class TamanhoDaFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = JOptionPane.showInputDialog("Forneça uma frase: ");
		int tamanho = frase.length();
		
		JOptionPane.showMessageDialog(null, "Frase: " + frase + 
				"\nQuantidade de Caracteres: " + tamanho);
		System.exit(0);

	}

}
