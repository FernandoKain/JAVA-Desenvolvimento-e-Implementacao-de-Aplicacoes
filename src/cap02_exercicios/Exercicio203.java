package cap02_exercicios;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		/* O imposto sobre a Transmissão de Bens Imóveis (ITBI) é aplicado sobre o valor de um imóvel a ser 
		 * negociado. A base de cálculo do ITBI (o valor a ser considerado no cálculo) será o maior valor entre o 
		 * valor de transação (o valor negociado) e o valor venal de referência (fornecido pela prefeitura). 
		 * Com base nisso, elabore uma classe que receba o valor da transação, o valor venal e o percentual 
		 * de imposto. Após isso, encontre o maior valor e aplique o percentual sobre ele. Ao final, apresente 
		 * o valor do imposto a ser pago. Observação: ovalor do imposto a ser pago é calculado por meio da fórmula: 
		 * 
		 * valor do imposto = maior valor * percentual / 100
		 * 
		 * Para entrada e saída de dados utilize a classe JOptionPane
		 */
		
		String aux;
		float valor_de_transacao;
		float valor_venal;
		float percentual_de_imposto;
		float maior_valor;
		float ITBI;
		
		try {
			aux = JOptionPane.showInputDialog("Entre com o valor da transação: ");
			valor_de_transacao = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com o valor venal do imóvel: ");
			valor_venal = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com o percentual de imposto: ");
			percentual_de_imposto = Float.parseFloat(aux);
			
			if(valor_de_transacao > valor_venal) {
				maior_valor = valor_de_transacao;
			}else {
				maior_valor = valor_venal;
			}
			
			ITBI = maior_valor * percentual_de_imposto / 100;
			
			JOptionPane.showMessageDialog(null, "O valor do imposto ITBI a ser pago é: " + ITBI);
			
			
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Houve um erro de conversão, digite somente caracteres numéricos!" + e.toString());
		}
		 
		

	}

}
