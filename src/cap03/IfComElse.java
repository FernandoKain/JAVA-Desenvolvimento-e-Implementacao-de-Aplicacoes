package cap03;

import javax.swing.JOptionPane;

public class IfComElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aux = JOptionPane.showInputDialog("Forneça o número do mês:");
		
		if (aux != null) {
			try {
				int mes = Integer.parseInt(aux);
				if(mes >=1 && mes <= 12) {
					JOptionPane.showMessageDialog(null, "Número do mês válido:\n " + mes);
				}else {
					JOptionPane.showMessageDialog(null, "Número do mês inválido:\n" + mes);
				}
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro: Digite apenas caracteres numéricos inteiros! " + e.toString());
			}
		}else {
			JOptionPane.showMessageDialog(null, "Operação Cancelada!");
		}

	}

}
