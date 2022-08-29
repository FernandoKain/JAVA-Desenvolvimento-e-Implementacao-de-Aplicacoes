package cap02_exercicios;

import javax.swing.JOptionPane;

public class Exercicio205 {

	public static void main(String[] args) {
		/* Considere a seguinte informação a respeito do cálculo da aposentadoria. Para se aposentar 
		 * por idade, as mulheres precisam ter atingido 60 anos de idade e os homens, 65. Já na 
		 * aposentadoria por tempo de contribuição, o tempo mínimo exigido é de 30 anos para as 
		 * mulheres e de 35 anos para os homens. Com base nessas informações, elabore um classe 
		 * que receba a idade de uma pessoa, seu sexo e a quantidade de anos de contribuição.
		 * A seguir, calcule quantos anos de contribuição faltam para a aposentadoria, ou então emita 
		 * a mensagem:
		 * 
		 * "Você já tem direito à aposentadoria."
		 */
		
		String aux;
		int idade;
		int sexo;
		int anos_de_contribuicao;
		int anos_para_aposentadoria;
		int idade_homem_aposentar = 65;
		int idade_mulher_aposentar = 60;

		aux = JOptionPane.showInputDialog("Digite a sua idade: ");
		idade = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Digita o seu sexo. \n 1 - para masculino \n 2 - para feminino");
		sexo = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Digite o número de anos de contribuição: ");
		anos_de_contribuicao = Integer.parseInt(aux);
		
		if(sexo == 1) {
			anos_para_aposentadoria = idade_homem_aposentar - anos_de_contribuicao;
			if(idade < 65 && anos_de_contribuicao < 35) {
				anos_de_contribuicao = 35 - anos_de_contribuicao;
				JOptionPane.showMessageDialog(null, "Você ainda precisa trabalhar: " + anos_de_contribuicao + " anos.");
			}else if(idade >= 65 && anos_de_contribuicao >= 35){
				JOptionPane.showMessageDialog(null, "Você já pode se aposentar!");
			}
		}else if(sexo == 2) {
			anos_para_aposentadoria = idade_mulher_aposentar - anos_de_contribuicao;
			if(idade < 60 && anos_de_contribuicao < 30) {
				anos_de_contribuicao = 30 - anos_de_contribuicao;
				JOptionPane.showMessageDialog(null, "Você ainda precisa trabalhar: " + anos_de_contribuicao + " anos.");
			}else if(idade >= 60 && anos_de_contribuicao >= 30){
				JOptionPane.showMessageDialog(null, "Você já pode se aposentar!");
			}
		}
		
		
				
		
		
		
		

	}

}
