package cap04;

import javax.swing.JOptionPane;

public class ArredondamentoParaCima {

	public static void main(String[] args) {
		// Calculando a quantidade de �nibus neces�rios
		
		final float LOTACAO_ONIBUS = 50;
		
		int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("N�mero de passageiros?"));
		float qtdOnibus = numeroPassageiros / LOTACAO_ONIBUS;
		
		JOptionPane.showMessageDialog(null, "Quantidade de passageiros: " + numeroPassageiros 
				+ "\nQuantidade Calculada: " + qtdOnibus
				+ "\nQuantidade de �nibus necess�rios: " + (int)Math.ceil(qtdOnibus));

	}

}
