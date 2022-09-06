package cap04_exercicios;

import javax.swing.JOptionPane;

public class Exercicio404 {

	public static void main(String[] args) {
		/* Construa uma classe que receba uma frase qualquer e mostre 
		 * essa frase de trás para frente e sem espaços em branco, 
		 * como indica a Figura 4.18 (Vide página 85)
		 */
		
		String frase = JOptionPane.showInputDialog(null, "Entre com uma frase qualquer:"); 
		String frase_sem_espacos;
		
		frase_sem_espacos = frase.replace(" ", "");
		
		StringBuffer sb = new StringBuffer(frase); 
		StringBuffer si = new StringBuffer(frase_sem_espacos);
		

		
		JOptionPane.showMessageDialog(null, "Frase normal: " + frase 
				+ "\nFrase invertida: " + sb.reverse() 
				+ "\nFrase invertida e sem espaços: " + si.reverse());
		
	}
}
