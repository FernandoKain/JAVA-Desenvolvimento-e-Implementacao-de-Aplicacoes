package cap02_exercicios;

import java.util.Scanner;
import java.io.*;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Usando a classe Scanner para entrada de dados, faça uma classe que receba dois valores inteiros. 
		 * O primeiro valor corresponde à quantidade e pontos do do líder do campeonato brasileiro de futebol;
		 * o segundo valor corresponde à quantidade de pontos do time lanterna. Considerando que cada vitória 
		 * vale 3 pontos, elabore uma classe que calcule o número de vitórias necessárias para que o time 
		 * lanterna alcance (ou ultrapasse) o líder. Por exemplo, supondo que as quantidades de ponto fornecidas 
		 * sejam 40 e 22, então o número de vitórias apresentada na saída deverá ser 6, pois:
		 * 
		 *  (40-22) / 3 = 6 
		 *  
		 *  (O exercício foi feito como pedido. Porém, o cálculo não é seguro para dizer quantas vitórias são 
		 *  necessárias para alcançar ou ultrapassar o líder. 
		 *  
		 *  Necessário implementar um bloco de condicionais.
		 */

		int lider;
		int lanterna;
		int vitorias_necessarias;
		
		
		Scanner sc;
		
		try {
			
			System.out.println("Insira a pontuação do time líder: ");
			sc = new Scanner(System.in);
			lider = sc.nextInt();
			
			System.out.println("Agora insira a pontuação do time lanterna: ");
			sc = new Scanner(System.in);
			lanterna = sc.nextInt();
			
		vitorias_necessarias = (lider-lanterna)/3;
		
		System.out.println("O número de vitórias necessárias para alcançar ou passar o líder é: " + vitorias_necessarias);

			
		}catch (NumberFormatException e) {

			System.out.println("Houve um erro de conversão, digite apenas caracteres numéricos! " + e.toString());
		}
		
	}

}
