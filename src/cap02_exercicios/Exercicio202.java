package cap02_exercicios;

import java.util.Scanner;
import java.io.*;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Usando a classe Scanner para entrada de dados, fa�a uma classe que receba dois valores inteiros. 
		 * O primeiro valor corresponde � quantidade e pontos do do l�der do campeonato brasileiro de futebol;
		 * o segundo valor corresponde � quantidade de pontos do time lanterna. Considerando que cada vit�ria 
		 * vale 3 pontos, elabore uma classe que calcule o n�mero de vit�rias necess�rias para que o time 
		 * lanterna alcance (ou ultrapasse) o l�der. Por exemplo, supondo que as quantidades de ponto fornecidas 
		 * sejam 40 e 22, ent�o o n�mero de vit�rias apresentada na sa�da dever� ser 6, pois:
		 * 
		 *  (40-22) / 3 = 6 
		 *  
		 *  (O exerc�cio foi feito como pedido. Por�m, o c�lculo n�o � seguro para dizer quantas vit�rias s�o 
		 *  necess�rias para alcan�ar ou ultrapassar o l�der. 
		 *  
		 *  Necess�rio implementar um bloco de condicionais.
		 */

		int lider;
		int lanterna;
		int vitorias_necessarias;
		
		
		Scanner sc;
		
		try {
			
			System.out.println("Insira a pontua��o do time l�der: ");
			sc = new Scanner(System.in);
			lider = sc.nextInt();
			
			System.out.println("Agora insira a pontua��o do time lanterna: ");
			sc = new Scanner(System.in);
			lanterna = sc.nextInt();
			
		vitorias_necessarias = (lider-lanterna)/3;
		
		System.out.println("O n�mero de vit�rias necess�rias para alcan�ar ou passar o l�der �: " + vitorias_necessarias);

			
		}catch (NumberFormatException e) {

			System.out.println("Houve um erro de convers�o, digite apenas caracteres num�ricos! " + e.toString());
		}
		
	}

}
