package cap02_exercicios;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		/* Considere a seguinte informa��o a respeito do c�lculo da aposentadoria. Para se aposentar 
		 * por idade, as mulheres precisam ter atingido 60 anos de idade e os homens, 65. J� na 
		 * aposentadoria por tempo de contribui��o, o tempo m�nimo exigido � de 30 anos para as 
		 * mulheres e de 35 anos para os homens. Com base nessas informa��es, elabore um classe 
		 * que receba a idade de uma pessoa, seu sexo e a quantidade de anos de contribui��o.
		 * A seguir, calcule quantos anos de contribui��o faltam para a aposentadoria, ou ent�o emita 
		 * a mensagem:
		 * 
		 * "Voc� j� tem direito � aposentadoria."
		 */
		
		String aux;
		int idade;
		int sexo;
		int anos_de_contribuicao;
		int anos_para_aposentadoria;

		aux = JOptionPane.showInputDialog("Digite a sua idade: ");
		idade = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Digita o seu sexo. \n 1 - para masculino \n 2 - para feminino");
		sexo = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Digite o n�mero de anos de contribui��o: ");
		anos_de_contribuicao = Integer.parseInt(aux);
		
		if(sexo == 1) {
			anos_para_aposentadoria = 65 - anos_de_contribuicao;
			if(anos_para_aposentadoria <= 35) {
				
			}
		}else if(sexo == 2) {
			anos_para_aposentadoria = 60 - anos_de_contribuicao;
		}
		
		
				
		
		
		
		

	}

}
