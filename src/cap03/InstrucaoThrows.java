package cap03;

import javax.swing.JOptionPane;

public class InstrucaoThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade: "));
			
			if(idade < 18) {
				throw new Exception("Menor de Idade, entrada não permitida!!");
			}else {
				JOptionPane.showMessageDialog(null, "Idade válida, seja bem vindo!");
			}
			// Continua a execução normalmente
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}
		
	}

}
