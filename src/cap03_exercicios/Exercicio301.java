package cap03_exercicios;

import java.io.IOException;

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
		float valor_do_produto;
		float valor_do_produto_com_desconto;
		int desconto;
		String aux;
		
		aux = JOptionPane.showInputDialog("Insira o nome do produto: ");
		nome_do_produto = aux;
		
		aux = JOptionPane.showInputDialog("Insira o valor do produto: ");
		valor_do_produto = Float.parseFloat(aux);
		

				if (valor_do_produto >= 50 && valor_do_produto <= 200) {
					desconto = 5;
					valor_do_produto_com_desconto = valor_do_produto - (valor_do_produto * desconto / 100);
					JOptionPane.showMessageDialog(null, "Nome do produto: " + nome_do_produto + "\nValor original do produto: " 
							+ valor_do_produto + "\nValor do produto com desconto: " + valor_do_produto_com_desconto);
					
				}else if(valor_do_produto >= 200 && valor_do_produto < 500) {
					desconto = 6;
					valor_do_produto_com_desconto = - (valor_do_produto * desconto / 100);
					JOptionPane.showMessageDialog(null, "Nome do produto: " + nome_do_produto + "\nValor original do produto: " 
							+ valor_do_produto + "\nValor do produto com desconto: " + valor_do_produto_com_desconto);
					
				}else if(valor_do_produto >= 500 && valor_do_produto < 1000) {
					desconto = 7;
					valor_do_produto_com_desconto = valor_do_produto - (valor_do_produto * desconto / 100);
					JOptionPane.showMessageDialog(null, "Nome do produto: " + nome_do_produto + "\nValor original do produto: " 
							+ valor_do_produto + "\nValor do produto com desconto: " + valor_do_produto_com_desconto);
					
				}else if(valor_do_produto >= 1000) {
					desconto = 8;
					valor_do_produto_com_desconto = valor_do_produto - (valor_do_produto * desconto / 100);
					JOptionPane.showMessageDialog(null, "Nome do produto: " + nome_do_produto + "\nValor original do produto: " 
							+ valor_do_produto + "\nValor do produto com desconto: " + valor_do_produto_com_desconto);
				}
				

		
	}

}
