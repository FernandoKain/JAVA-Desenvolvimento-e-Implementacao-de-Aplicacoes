package cap02_exercicios;

import javax.swing.JOptionPane;

public class Exercicio204 {

	public static void main(String[] args) {
		/* Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota 
		 * de duas provas e de um trabalho. Calcule e mostre a média e o resultado final (aprovado 
		 * ou reprovado). Para calcular a média utilize a fórmula sequinte: 
		 * 
		 * média = (nota da prova 1 + nota da prova 2 + nota do trabalho) / 3
		 * 
		 * Considere que amédia mínima para aprovação é 6.
		 * 
		 */
		
		String aux;
		float prova1;
		float prova2;
		float trabalho;
		float media;
		String resultado;
		
		try {
			
			aux = JOptionPane.showInputDialog("Entre com o valor da prova 1: ");
			prova1 = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com o valor da prova 2: ");
			prova2 = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com o valor do trabalho: ");
			trabalho = Float.parseFloat(aux);
			
			media = (prova1 + prova2 + trabalho)/3;
			
			if(media >= 6) {
				resultado = "APROVADO!";
			}else {
				resultado = "REPROVADO!";
			}
			
			JOptionPane.showMessageDialog(null, "Sua média é: "+ media + " e você foi " + resultado);
			
			
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Houve um erro de digitação." + e.toString());
		}

	}

}
