package cap03;

import javax.swing.JOptionPane;

public class IfComElseAninhado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aux = JOptionPane.showInputDialog("Forne�a o n�mero do m�s: ");
		
		if(aux != null) {
			try {
				int mes = Integer.parseInt(aux);
				if (mes == 1) {
					aux = "Janeiro";
				}else if(mes == 2){
					aux = "Fevereiro";
				}else if(mes == 3){
					aux = "Mar�o";
				}else if(mes == 4){
					aux = "Abril";
				}else if(mes == 5){
					aux = "Maio";
				}else if(mes == 6){
					aux = "Junho";
				}else if(mes == 7){
					aux = "Julho";
				}else if(mes == 8){
					aux = "Agosto";
				}else if(mes == 9){
					aux = "Setembro";
				}else if(mes == 10){
					aux = "Outubro";
				}else if(mes == 11){
					aux = "Novembro";
				}else if(mes == 12){
					aux = "Dezembro";
				}else {
					aux = "M�s Desconhecido!";
				}
				JOptionPane.showMessageDialog(null, aux);
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros!" + e);
			}
		}
		System.exit(0);
	}

}
