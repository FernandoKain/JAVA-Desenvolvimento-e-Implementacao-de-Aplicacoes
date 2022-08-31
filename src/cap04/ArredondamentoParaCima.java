package cap04;

import javax.swing.JOptionPane;

public class ArredondamentoParaCima {

	public static void main(String[] args) {
		// Calculando a quantidade de ônibus necesários
		
		final float LOTACAO_ONIBUS = 50;
		
		int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Número de passageiros?"));
		float qtdOnibus = numeroPassageiros / LOTACAO_ONIBUS;
		
		JOptionPane.showMessageDialog(null, "Quantidade de passageiros: " + numeroPassageiros 
				+ "\nQuantidade Calculada: " + qtdOnibus
				+ "\nQuantidade de Ônibus necessários: " + (int)Math.ceil(qtdOnibus));

	}

}
