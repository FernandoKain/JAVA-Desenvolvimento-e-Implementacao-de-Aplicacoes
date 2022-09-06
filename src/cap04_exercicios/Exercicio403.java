package cap04_exercicios;

import javax.swing.JOptionPane;

public class Exercicio403 {

	public static void main(String[] args) {
		/* Crie uma classe que gera um número aleatoriamente entre 5 e 10 por Math.random. 
		 * em seguida, faça com que apareça em tela uma senha numérica contendo a mesma 
		 * quantidade de dígitos correspondentes aos valor aleatório gerado.
		 * Apresente em tela o número sorteado e a senha.
		 */
		
		String senha = "";
		
		int num_aleatorio = (int)(Math.random()*6 + 5);
		
		for (int i = 1; i <= num_aleatorio; i++ ) {
			int num = (int)(Math.random()*10);
			senha += num;
		}
		
		JOptionPane.showMessageDialog(null, 
				"Número sorteado: " + num_aleatorio + 
				"\nSenha gerada: " + senha);

	}

}
