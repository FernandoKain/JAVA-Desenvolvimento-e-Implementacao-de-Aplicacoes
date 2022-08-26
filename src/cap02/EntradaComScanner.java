package cap02;

import java.util.Scanner;

public class EntradaComScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float largura, comprimento, area, perimetro;
		Scanner sc;
		
		try {
			System.out.println("Entre com o comprimento: ");
			sc = new Scanner(System.in);
			comprimento = sc.nextFloat();
			
			System.out.println("Entre com a largura: ");
			sc = new Scanner(System.in);
			largura = sc.nextFloat();
			
			area = comprimento * largura;
			perimetro = (2 * comprimento) + (2 * largura);
			
			System.out.println("Área do retângulo: " + area);
			System.out.println("Perímetro do retângulo: " + perimetro);
		}catch (NumberFormatException e) {
			System.out.println("Houve um erro na conversão, digite apenas caracteres numéricos.");
		}

	}

}
