package cap03;

import javax.swing.JOptionPane;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] op = {"Masculino", "Feminino"};
		String resp = (String)JOptionPane.showInputDialog(null, "Selecione o sexo: \n", "Pesquisa", 
				JOptionPane.QUESTION_MESSAGE, null, op, "Masculino");
		
		if(resp == null) {
			JOptionPane.showMessageDialog(null, "Voc� pressionou 'Cancel'.");
		}
		if (resp.equals("Masculino")) {
			JOptionPane.showMessageDialog(null, "Voc� � homem.");
		}
		if(resp.equals("Feminino")) {
			JOptionPane.showMessageDialog(null, "Voc� � mulher.");
		}
		System.exit(0);
	}

}
