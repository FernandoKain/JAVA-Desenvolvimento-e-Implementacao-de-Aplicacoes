package cap04;

import javax.swing.JOptionPane;

public class TrocandoCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = JOptionPane.showInputDialog("Forneça uma frase: ");
		JOptionPane.showMessageDialog(null, "Frase: " + frase
				+ "\nRetirando os espaços: " + frase.replace(" ", "")
				+ "\nSubstituindo a por u: " + frase.replace("a", "u"));
		
		System.exit(0);

	}

}
