package cap03;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String aux1 = JOptionPane.showInputDialog("Forneça o valor do primeiro número: ");
			int num1 = Integer.parseInt(aux1);
			
			String aux2 = JOptionPane.showInputDialog("Forneça o valor do segundo número: ");
			int num2 = Integer.parseInt(aux2);
			
			JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
			JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
			JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
			JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));
			
		}catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Erro de divisão por ZERO. \n" + e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Erro de conversão. \nDigite somente caracteres numéricos. \n" + e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Tecla 'CANCEL' foi pressionada. \n" + e.toString(), "Cancelado pelo usuário! ", JOptionPane.ERROR_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null, "Final da Execução.");
		}
		
		System.exit(0);

	}

}
