package cap04_exercicios;

import javax.swing.JOptionPane;

public class Exercicio405 {

	public static void main(String[] args) {
		/* Elabore uma classe que receba uma frase e verifique se essa frase possui palavras impr�prias. 
		 * As palavras impr�prias s�o: sexo e sexual. Caso encontre uma dessas palavras, emita em tela a mensagem "conte�do 
		 * impr�prio"; caso contr�rio "conte�do liberado".
		 */
		
		String frase = JOptionPane.showInputDialog("Forne�a uma frase: ");
		
		String sexo = "sexo";
		String sexual = "sexual";
		
		JOptionPane.showMessageDialog(null, "Frase: " + frase);
		

		if (frase.contains(sexo) || frase.contains(sexual)) {
			JOptionPane.showMessageDialog(null, "Conte�do impr�prio!");
		}else {
			JOptionPane.showMessageDialog(null, "Conte�do liberado!");
		}

	}
	
	

}
