package cap04;

import javax.swing.JOptionPane;

public class CaracteresDaPalavra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra = JOptionPane.showInputDialog("Forneça uma "
				+ "palavra com pelo menos 4 letras");

		JOptionPane.showMessageDialog(null, "Palavra: " + palavra
				+ "\nCaractere 1: " + palavra.charAt(0)
				+ "\nCaractere 2: " + palavra.charAt(1)
				+ "\nCaractere 3: " + palavra.charAt(2)
				+ "\nCaractere 4: " + palavra.charAt(3));
		System.exit(0);
		
		
	}

}
