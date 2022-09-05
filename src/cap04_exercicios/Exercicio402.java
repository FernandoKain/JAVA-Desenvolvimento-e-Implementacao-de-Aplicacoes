package cap04_exercicios;

import javax.swing.JOptionPane;

public class Exercicio402 {

	public static void main(String[] args) {
		/* Uma farm�cia precisa ajustar os pre�os de seus produtos em 12%. Elabore uma classe que recebe
		 * o valor do produto e aplique o percentual de acr�scimo. O novo valor a ser calculado deve 
		 * ser arredondado para mais ou para menos usando-se o m�todo round. A classe deve tamb�m conter um 
		 * la�o de repeti��o que encerre o programa quando o usu�rio fornecer o valor zero (0) para
		 * o valor do produto. Dessa forma, o usu�rio digita o valor do produto, a classe calcula 
		 * e mostra o valor com acr�scimo, a seguir solicita um novo valor. Esse processo continua enquanto 
		 * o valor do produto for diferente de zero; caso contr�rio, o programa ser� encerrado.
		 * 
		 */
		
		String aux;
		String nome_do_produto;
		float valor_do_produto = 1;
		float percentual_de_acrescimo = 0.12f;
		
		

		while (valor_do_produto != 0) {
			
			aux = JOptionPane.showInputDialog("Insira o nome do produto: ");
			nome_do_produto = aux;
			
			aux = JOptionPane.showInputDialog("Insira o valor do produto: ");
			valor_do_produto = Float.parseFloat(aux);
			
			
			valor_do_produto = (valor_do_produto * percentual_de_acrescimo) + valor_do_produto;
			valor_do_produto = Math.round(valor_do_produto);
			JOptionPane.showMessageDialog(null, 
					"Produto: " + nome_do_produto + 
					"\nValor do Produto: " + valor_do_produto );
		}
		System.exit(0);
		
	}

}
