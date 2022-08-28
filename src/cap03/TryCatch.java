package cap03;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String aux1 = JOptionPane.showInputDialog("Forne�a o valor do primeiro n�mero: ");
			int num1 = Integer.parseInt(aux1);
			
			String aux2 = JOptionPane.showInputDialog("Forne�a o valor do segundo n�mero: ");
			int num2 = Integer.parseInt(aux2);
			
			JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
			JOptionPane.showMessageDialog(null, "Subtra��o = " + (num1 - num2));
			JOptionPane.showMessageDialog(null, "Multiplica��o = " + (num1 * num2));
			JOptionPane.showMessageDialog(null, "Divis�o = " + (num1 / num2));
			
		}catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Erro de divis�o por ZERO. \n" + e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Erro de convers�o. \nDigite somente caracteres num�ricos. \n" + e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Tecla 'CANCEL' foi pressionada. \n" + e.toString(), "Cancelado pelo usu�rio! ", JOptionPane.ERROR_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null, "Final da Execu��o.");
		}
		
		System.exit(0);

	}

}
