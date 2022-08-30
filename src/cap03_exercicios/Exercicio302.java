package cap03_exercicios;

import javax.swing.JOptionPane;

public class Exercicio302 {

	public static void main(String[] args) {
		/* Na área da eletrônica, em um circuito em série temos que a resistência equivalente (total) 
		 * desse circuito é obtida mediante a soma de todas as resistências existentes: 
		 * 
		 * (RE = r1 + r2 + r3 + ... + rn).
		 * 
		 * Faça uma classe que receba o valor de quatro resistências ligadas em série, calcule e mostre 
		 * a resistência equivalente, a maior e a menor resistência, conforme indica a Figura 3.17 (Vide 
		 * livro página 67)
		 */
		
		float RE;
		float r1, r2, r3, r4;
		float maior;
		float menor;
		String aux;
		
		aux = JOptionPane.showInputDialog("Insira o valor da resistência r1: ");
		r1 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Insira o valor da resistência r2: ");
		r2 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Insira o valor da resistência r3: ");
		r3 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Insira o valor da resistência r4: ");
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
			
			JOptionPane.showMessageDialog(null, "Resistências fornecidas: \n" + r1 + ", " + r2 + ", " + r3 + ", " + r4 
					+ ".\n" + "A menor resistência é: " + menor + "\nA maior resistência é: " + maior + 
					"\nE a soma das resistências é: " + RE);
			
	}
}

	
	