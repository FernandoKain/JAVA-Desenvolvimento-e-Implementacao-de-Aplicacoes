package cap03;

import javax.swing.JOptionPane;

public class InstrucaoThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Forne�a sua idade: "));
			
			if(idade < 18) {
				throw new Exception("Menor de Idade, entrada n�o permitida!!");
			}else {
				JOptionPane.showMessageDialog(null, "Idade v�lida, seja bem vindo!");
			}
			// Continua a execu��o normalmente
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}
		
	}

}
