package cap05_exercicios;

import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Exercicio501 {

	public static void main(String[] args) {
		/* Elabore uma classe que receba cinco notas de alunos por meio de 
		 * showInputDialog, armazene essas notas em um array de cinco elementos,
		 * apresente em tela as cinco notas em ordem decrescente (da maior para a menor) e a média aritmética das ntoas.
		 * 
		 * Ainda falta fazer o tratamento de exceções, porém o programa está funcional.
		 */
		
		float[] notas = new float[5];
		
		for (int i = 0; i < notas.length; i++) {
			String nota = JOptionPane.showInputDialog("Insira a nota " + (i));
			notas[i] = Float.parseFloat(nota);
			
		}
		
		Arrays.sort(notas);
		
		
		JOptionPane.showMessageDialog(null, "As notas obtidas foram: " 
				+ "\n" + notas[0] 
				+ "\n" + notas[1] 
				+ "\n" + notas[2] 
				+ "\n" + notas[3] 
				+ "\n" + notas[4]
				+ "\n" + "A média das notas é: "
				+ "\n" + (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]) / 5);

	}

}

