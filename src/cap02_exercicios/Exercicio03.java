package cap02_exercicios;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		/* O imposto sobre a Transmiss�o de Bens Im�veis (ITBI) � aplicado sobre o valor de um im�vel a ser 
		 * negociado. A base de c�lculo do ITBI (o valor a ser considerado no c�lculo) ser� o maior valor entre o 
		 * valor de transa��o (o valor negociado) e o valor venal de refer�ncia (fornecido pela prefeitura). 
		 * Com base nisso, elabore uma classe que receba o valor da transa��o, o valor venal e o percentual 
		 * de imposto. Ap�s isso, encontre o maior valor e aplique o percentual sobre ele. Ao final, apresente 
		 * o valor do imposto a ser pago. Observa��o: ovalor do imposto a ser pago � calculado por meio da f�rmula: 
		 * 
		 * valor do imposto = maior valor * percentual / 100
		 * 
		 * Para entrada e sa�da de dados utilize a classe JOptionPane
		 */
		
		String aux;
		float valor_de_transacao;
		float valor_venal;
		float percentual_de_imposto;
		float maior_valor;
		float ITBI;
		
		try {
			aux = JOptionPane.showInputDialog("Entre com o valor da transa��o: ");
			valor_de_transacao = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com o valor venal do im�vel: ");
			valor_venal = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com o percentual de imposto: ");
			percentual_de_imposto = Float.parseFloat(aux);
			
			if(valor_de_transacao > valor_venal) {
				maior_valor = valor_de_transacao;
			}else {
				maior_valor = valor_venal;
			}
			
			ITBI = maior_valor * percentual_de_imposto / 100;
			
			JOptionPane.showMessageDialog(null, "O valor do imposto ITBI a ser pago �: " + ITBI);
			
			
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Houve um erro de convers�o, digite somente caracteres num�ricos!" + e.toString());
		}
		 
		

	}

}
