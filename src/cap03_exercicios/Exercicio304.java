package cap03_exercicios;

import javax.swing.JOptionPane;

public class Exercicio304 {

	public static void main(String[] args) {
		/*Fa�a uma classe que apresente em tela a tabuada de qualquer n�mero. O usu�rio fornece o 
		 * n�mero desejado e a classe apresenta a rela��o de todos os c�lculos de 1 a 10. Veja um 
		 * exemplo de execu��o na Figura 3.19 (p�gina 68)
		 */

		int numero_desejado;
		
		String aux = JOptionPane.showInputDialog("Forne�a um n�mero para saber a sua tabuada: ");
		numero_desejado = Integer.parseInt(aux);
		
		JOptionPane.showMessageDialog(null, 
				numero_desejado + " x 1 = " + (numero_desejado * 1) +"\n" + 
				numero_desejado + " x 2 = " + (numero_desejado * 2) +"\n" +
				numero_desejado + " x 3 = " + (numero_desejado * 3) +"\n" +
				numero_desejado + " x 4 = " + (numero_desejado * 4) +"\n" +
				numero_desejado + " x 5 = " + (numero_desejado * 5) +"\n" +
				numero_desejado + " x 6 = " + (numero_desejado * 6) +"\n" +
				numero_desejado + " x 7 = " + (numero_desejado * 7) +"\n" +
				numero_desejado + " x 8 = " + (numero_desejado * 8) +"\n" +
				numero_desejado + " x 9 = " + (numero_desejado * 9) +"\n" +
				numero_desejado + " x 10 = " + (numero_desejado * 10) +"\n");
		
	}

}
