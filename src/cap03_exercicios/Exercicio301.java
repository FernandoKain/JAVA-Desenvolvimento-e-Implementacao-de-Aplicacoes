package cap03_exercicios;

import javax.swing.JOptionPane;

public class Exercicio301 {

	public static void main(String[] args) {
		/* Usando JOptionPane, elabore uma classe que receba o nome de um produto 
		 * e o seu valor. O desconte deve ser calculado de acordo com o valor fornecido
		 * pela Tabela 3.1 (Vide livro, página 67). Utilizando a estrutura if-else, 
		 * apresente em tela o nome do produto, valor original do produto e o novo valor 
		 * depois de ser realizado o desconto. Caso o valor digitado seja menor que
		 * zero, deve ser emitida uma mensagem de aviso. A Figura 3.16 (página 67) 
		 * ilustra a execução do Exercício 3.1
		 * 
		 */
		String nome_do_produto;
		float valor;
		
		String aux = JOptionPane.showInputDialog("Insira o nome do produto: ");
		System.out.println(aux);

	}

}
