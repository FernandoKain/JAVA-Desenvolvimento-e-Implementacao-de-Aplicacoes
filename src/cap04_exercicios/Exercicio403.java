package cap04_exercicios;

import javax.swing.JOptionPane;

public class Exercicio403 {

	public static void main(String[] args) {
		/* Crie uma classe que gera um n�mero aleatoriamente entre 5 e 10 por Math.random. 
		 * em seguida, fa�a com que apare�a em tela uma senha num�rica contendo a mesma 
		 * quantidade de d�gitos correspondentes aos valor aleat�rio gerado.
		 * Apresente em tela o n�mero sorteado e a senha.
		 */
		
		String senha = "";
		
		int num_aleatorio = (int)(Math.random()*6 + 5);
		
		for (int i = 1; i <= num_aleatorio; i++ ) {
			int num = (int)(Math.random()*10);
			senha += num;
		}
		
		JOptionPane.showMessageDialog(null, 
				"N�mero sorteado: " + num_aleatorio + 
				"\nSenha gerada: " + senha);

	}

}
