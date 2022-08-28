package cap03;

import javax.swing.JOptionPane;

public class GetMessagePrintStackTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número: "));
		
		try {
			int y = x / 0; // gera uma exceção
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}

	}

}
