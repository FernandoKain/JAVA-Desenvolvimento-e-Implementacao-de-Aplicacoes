package cap04;

import javax.swing.JOptionPane;

public class UsaRandom {

	public static void main(String[] args) {
		// Método para randômico para gerar senha ou qualquer outro valor
		
		String senha = "";
		
		for (int i = 1; i <= 10; i++ ) {
			int num = (int)(Math.random()*10);
			senha += num;
		}
		
		JOptionPane.showMessageDialog(null, "Senha gerada: " + senha);
		
		for (int cartao = 1; cartao <= 4; cartao++) {//Número de cartões gerados 4
			String numerosCartao = "";
			
			for (int numCartao = 1; numCartao <= 6; numCartao++) {//qtd de números por cartão (6 números de 0 a 100)
				int num = (int)(Math.random()*100);
				numerosCartao += num + "  "; // Separação entre os números gerados
			}
			
			JOptionPane.showMessageDialog(null, "Numeros do cartão: " + cartao
					+ "\n" + numerosCartao);
			
		}
		
		System.exit(0);

	}

}
