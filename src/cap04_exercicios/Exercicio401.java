package cap04_exercicios;

import javax.swing.JOptionPane;

public class Exercicio401 {

	public static void main(String[] args) {
		/* Crie uma classe que simule a jogada de um dado de seis lados (números de 1 a 6) por três 
		 * vezes. Ao final, some seus valores e apresente o resultado das três jogadas. Veja o exemplo dos 
		 * lançamentos na Figura 4.15 (vide página 84)
		 */
		
		int jogada1, jogada2, jogada3;
		
		JOptionPane.showMessageDialog(null, "O dado será rolado três vezes! Atenção para os resultados!");
		
		jogada1 = (int) (Math.random() *6 + 1);
		jogada2 = (int) (Math.random() *6 + 1);
		jogada3 = (int) (Math.random() *6 + 1);
		
		int soma_das_jogadas = jogada1 + jogada2 + jogada3;
		
		JOptionPane.showInternalMessageDialog(null, "Números sorteados: \n"
				+ jogada1 + "\n"
				+ jogada2 + "\n"
				+ jogada3 + "\n"
				+ "Total das jogadas: " + soma_das_jogadas);

	}

}
