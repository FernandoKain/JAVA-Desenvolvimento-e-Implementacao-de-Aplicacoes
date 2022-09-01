package cap04;

import javax.swing.JOptionPane;

public class MostraLetras {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String palavra = JOptionPane.showInputDialog("Forneça uma palavra: ");
		

		
		for (int i = palavra.length() - 1; i >=0; i--) {
			char c = palavra.charAt(i);
			System.out.print(c);
			Thread.sleep(1000);
		}
		
		for (int i = 0; i <= palavra.length(); i++) {
			char c = palavra.charAt(i);
			System.out.print(c);
			Thread.sleep(1000);
		}
		System.out.println();
		

		


	}

}
