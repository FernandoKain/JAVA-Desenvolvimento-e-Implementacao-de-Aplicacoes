package cap03;

import javax.swing.JOptionPane;

public class ContadorWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
			int contador = limite;
			
			while(contador >= 0) {
				System.out.println(contador);
				contador--;
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.toString();
				}
			}
			System.out.println("Fim do contador regressivo.");
		}catch (NumberFormatException e) {
			System.out.println("Não foi fornecido um número inteiro válido!\n" + e.toString());
		}
		System.exit(0);

	}

}
