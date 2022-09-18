package cap05;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayBuscaBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = new int[10000];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random()*1000);
		}
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Forne�a um n�mero: "));
		String r = "Valor n�o encontrado!";
		
		for (int i = 0; i < n.length; i++) {
			if(n[i] == valor) {
				r = "Valor encontrado na posi��o " + i;
				break;
			}
		}
		System.out.println(r);
		
		Arrays.sort(n);
		int pos = Arrays.binarySearch(n, valor);
		System.out.println("Nova posi��o ordenada: " + pos);

	}

}
