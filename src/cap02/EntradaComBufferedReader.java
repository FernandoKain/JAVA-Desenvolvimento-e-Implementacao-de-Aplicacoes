package cap02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EntradaComBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		float largura, comprimento , area, perimetro;
		BufferedReader dado;
		
		try {
			
			System.out.println("Entre com o comprimento");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			comprimento = Float.parseFloat(s);
			
			System.out.println("Entre com a largura:");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			largura = Float.parseFloat(s);
			
			area = comprimento * largura;
			perimetro = (2*comprimento) + (2*largura);
			
			System.out.println("�rea do ret�ngulo: " + area);
			System.out.println("Per�metro do ret�ngulo: " + perimetro);
			
		} catch (IOException erro) {
			
			System.out.println("Houve um erro na entrada de dados" + erro.toString());
			
		} catch (NumberFormatException erro) {

			System.out.println("Houve um erro de convers�o, digite apenas caracteres num�ricos!" + erro.toString());
		}
	}

}
