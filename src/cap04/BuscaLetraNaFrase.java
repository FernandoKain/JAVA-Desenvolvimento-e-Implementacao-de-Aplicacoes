package cap04;

import javax.swing.JOptionPane;

public class BuscaLetraNaFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "Livro Java - Ensino did�tico";
		
		char caractere = 'i';
		
		JOptionPane.showMessageDialog(null, "Frase:  " + frase 
				+ "\n�ndice: " + frase.indexOf(caractere)
				+ ", " + frase.indexOf(caractere, 10)
				+ ", " + frase.indexOf("Ensino")
				+ ", " + frase.indexOf("Java", 15));
		
		System.exit(0);

	}

}
