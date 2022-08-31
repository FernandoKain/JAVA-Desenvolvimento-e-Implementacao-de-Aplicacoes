package cap04;

import javax.swing.JOptionPane;

public class DiversosMetodos {

	public static void main(String[] args) {
		// Diversos métodos
		
		double a = 2.4;
		double b = 2.8;
		double c = 4;
		double d = -1;
		
		String r = "Arredondamento de " + a + " = " + Math.round(a)
				+ "\nArredondamento de " + b + " = " + Math.round(b) 
				+ "\nMaior valor entre " + a + " e " + b + " = " + Math.max(a, b)
				+ "\nMenor valor entre " + a + " e " + b + " = " + Math.min(a, b)
				+ "\nO quadrado de " + c + " = " + Math.pow(c, 2)
				+ "\nA raiz quadrada de " + c + " = " + Math.sqrt(c)
				+ "\nValor absoluto de " + d + " = " + Math.abs(d);
		
		JOptionPane.showMessageDialog(null, r);
		
		

	}

}
