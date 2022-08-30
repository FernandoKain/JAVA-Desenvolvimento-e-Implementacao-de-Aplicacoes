package cap03_exercicios;

import javax.swing.JOptionPane;

public class Exercicio302 {

	public static void main(String[] args) {
		/* Na �rea da eletr�nica, em um circuito em s�rie temos que a resist�ncia equivalente (total) 
		 * desse circuito � obtida mediante a soma de todas as resist�ncias existentes: 
		 * 
		 * (RE = r1 + r2 + r3 + ... + rn).
		 * 
		 * Fa�a uma classe que receba o valor de quatro resist�ncias ligadas em s�rie, calcule e mostre 
		 * a resist�ncia equivalente, a maior e a menor resist�ncia, conforme indica a Figura 3.17 (Vide 
		 * livro p�gina 67)
		 */
		
		float RE;
		float r1, r2, r3, r4;
		float maior;
		float menor;
		String aux;
		
		aux = JOptionPane.showInputDialog("Insira o valor da resist�ncia r1: ");
		r1 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Insira o valor da resist�ncia r2: ");
		r2 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Insira o valor da resist�ncia r3: ");
		r3 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Insira o valor da resist�ncia r4: ");
		r4 = Float.parseFloat(aux);
		
		RE = r1 + r2 + r3 + r4;
		
			
			if(r1 <= r2 && r1 <= r3 && r1 <= r4) {
				menor = r1;
				
			}else if (r2 <= r1 && r2 <= r3 && r2 <= r4) {
				menor = r2;
				
			}else if (r3 <= r1 && r3 <= r2 && r3 <= r4) {
				menor = r3;
				
			}else if (r4 <= r1 && r4 <= r2 && r4 <= r3) {
				menor = r4;
			}else {
				menor=0;
			}
			
			
			if(r1 >= r2 && r1 >= r3 && r1 >= r4) {
				maior = r1;
				
			}else if (r2 >= r1 && r2 >= r3 && r2 >= r4) {
				maior = r2;
				
			}else if (r3 >= r1 && r3 >= r2 && r3 >= r4) {
				maior = r3;
				
			}else if (r4 >= r1 && r4 >= r2 && r4 >= r3) {
				maior = r4;
			}else{
				maior = 0;
			}
			
			JOptionPane.showMessageDialog(null, "Resist�ncias fornecidas: \n" + r1 + ", " + r2 + ", " + r3 + ", " + r4 
					+ ".\n" + "A menor resist�ncia �: " + menor + "\nA maior resist�ncia �: " + maior + 
					"\nE a soma das resist�ncias �: " + RE);
			
	}
}

	
	