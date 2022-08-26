package cap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Usando a classe BufferedReader para entrada de dados, crie uma classe que receba o valor de um produto e a
		 * porcentagem de desconto, calcule e mostre o valor do desconto e o valor do produto com o desconto. Observação:
		 * o valor do desconto é calculado por meio da fórmula:
		 * 
		 * valor do desconto = valor do produto * percentual de desconto / 100
		 * 
		 */

		String s;
		float valor_do_desconto, valor_do_produto, percentual_de_desconto;
		BufferedReader dado;
		
		try {
			
			System.out.println("Entre com o valor do produto: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			valor_do_produto = Float.parseFloat(s);
			
			System.out.println("Entre com o valor percentual do desconto: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			percentual_de_desconto = Float.parseFloat(s);
			
			valor_do_desconto = valor_do_produto * (percentual_de_desconto / 100);
			
			System.out.println("O valor do desconto é R$" + valor_do_desconto);
			
		}catch (IOException e) {
			System.out.println("Houve um erro na entrada de dados. " + e.toString());
		}catch (NumberFormatException e) {
			System.out.println("Houve um erro de conversão, digite somente caracteres numéricos! " + e.toString());
		}
		System.exit(0);
		
	}

}
