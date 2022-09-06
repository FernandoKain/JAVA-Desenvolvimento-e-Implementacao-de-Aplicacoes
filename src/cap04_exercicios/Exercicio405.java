package cap04_exercicios;

import javax.swing.JOptionPane;

public class Exercicio405 {

	public static void main(String[] args) {
		/* Elabore uma classe que receba uma frase e verifique se essa frase possui palavras impróprias. 
		 * As palavras impróprias são: sexo e sexual. Caso encontre uma dessas palavras, emita em tela a mensagem "conteúdo 
		 * impróprio"; caso contrário "conteúdo liberado".
		 */
		
		String frase = JOptionPane.showInputDialog("Forneça uma frase: ");
		
		String sexo = "sexo";
		String sexual = "sexual";
		
		JOptionPane.showMessageDialog(null, "Frase: " + frase);
		

		if (frase.contains(sexo) || frase.contains(sexual)) {
			JOptionPane.showMessageDialog(null, "Conteúdo impróprio!");
		}else {
			JOptionPane.showMessageDialog(null, "Conteúdo liberado!");
		}

	}
	
	

}
