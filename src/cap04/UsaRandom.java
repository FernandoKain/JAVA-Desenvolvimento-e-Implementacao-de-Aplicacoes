package cap04;

import javax.swing.JOptionPane;

public class UsaRandom {

	public static void main(String[] args) {
		// M�todo para rand�mico para gerar senha ou qualquer outro valor
		
		String senha = "";
		
		for (int i = 1; i <= 10; i++ ) {
			int num = (int)(Math.random()*10);
			senha += num;
		}
		
		JOptionPane.showMessageDialog(null, "Senha gerada: " + senha);
		
		for (int cartao = 1; cartao <= 4; cartao++) {//N�mero de cart�es gerados 4
			String numerosCartao = "";
			
			for (int numCartao = 1; numCartao <= 6; numCartao++) {//qtd de n�meros por cart�o (6 n�meros de 0 a 100)
				int num = (int)(Math.random()*100);
				numerosCartao += num + "  "; // Separa��o entre os n�meros gerados
			}
			
			JOptionPane.showMessageDialog(null, "Numeros do cart�o: " + cartao
					+ "\n" + numerosCartao);
			
		}
		
		System.exit(0);

	}

}
