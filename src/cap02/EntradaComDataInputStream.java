package cap02;

import java.io.*;

public class EntradaComDataInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		float largura, comprimento, area, perimetro;
		DataInputStream dado;
		
		try {
			System.out.println("Entre com o comprimento:");
			dado = new DataInputStream(System.in);
			s = dado.readLine(); // deprecated
			comprimento = Float.parseFloat(s);
			
			System.out.println("Entre com a largura: ");
			dado = new DataInputStream(System.in);
			s = dado.readLine(); //deprecated
			largura = Float.parseFloat(s);
			
			area = comprimento * largura;
			perimetro = (2*comprimento) + (2*largura);
			System.out.println("Área do retângulo: " + area);
			System.out.println("Perímetro do retângulo: " + perimetro);
			
		}catch(IOException erro) {
			System.out.println("Houve um erro na entrada de dados " + erro.toString());
		}catch (NumberFormatException erro) {
			System.out.println("Houve um erro na conversão, digite apenas caracteres numéricos " + erro.toString());
		}
		

	}

}
