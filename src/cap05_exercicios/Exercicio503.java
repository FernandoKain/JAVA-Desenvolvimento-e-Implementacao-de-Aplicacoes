<<<<<<< HEAD
package cap05_exercicios;

import java.util.Random;

public class Exercicio503 {

	public static void main(String[] args) {
		/*Uma imagem é formada por pixels. Considere uma imagem com 
		 * dimensão de 40 x 40 de faça uma classe que contenha um array bidimensional
		 * com essas dimensões. A seguir, para cada posição desse array bidimensional 
		 * armazene um valor aleatório entre 0 e 255 (esses valores correspondem às 
		 * tonalidades apliadas sobre a imagem). Apresente em tela os 1600 valores 
		 * gerados.
		 */
		
		int[][] arrayDeCores = new int[40][40];
		Random random = new Random();
		
		for (int linha = 0; linha < arrayDeCores.length; linha++) {
			for (int coluna = 0; coluna < arrayDeCores[linha].length; coluna++) {
				arrayDeCores[linha][coluna] = random.nextInt(255);
				System.out.println("[" + linha + "," + coluna + "]" + arrayDeCores[linha][coluna]);
			}
		}

	}

}
=======
package cap05_exercicios;

import java.util.Random;

public class Exercicio503 {

	public static void main(String[] args) {
		/*Uma imagem é formada por pixels. Considere uma imagem com 
		 * dimensão de 40 x 40 de faça uma classe que contenha um array bidimensional
		 * com essas dimensões. A seguir, para cada posição desse array bidimensional 
		 * armazene um valor aleatório entre 0 e 255 (esses valores correspondem às 
		 * tonalidades apliadas sobre a imagem). Apresente em tela os 1600 valores 
		 * gerados.
		 */
		
		int[][] arrayDeCores = new int[40][40];
		Random random = new Random();
		
		for (int linha = 0; linha < arrayDeCores.length; linha++) {
			for (int coluna = 0; coluna < arrayDeCores[linha].length; coluna++) {
				arrayDeCores[linha][coluna] = random.nextInt(255);
				System.out.println("[" + linha + "," + coluna + "]" + arrayDeCores[linha][coluna]);
			}
		}

	}

}
>>>>>>> 618109f7372b190421319bb6a0dc6fc6d9bab963
