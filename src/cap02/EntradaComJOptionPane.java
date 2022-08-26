package cap02;

import javax.swing.JOptionPane;

public class EntradaComJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aux;
		float largura, comprimento, area, perimetro;
		
		try {
			aux = JOptionPane.showInputDialog("Entre com o comprimento: ");
			comprimento = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com a largura: ");
			largura = Float.parseFloat(aux);
			
			area = comprimento * largura;
			perimetro = (2 * comprimento) + (2 * largura);
			
			JOptionPane.showMessageDialog(null, "Área: " + area + ", perímetro: " + perimetro);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite apenas caracteres numéricos!" + e.toString());
		}
		System.exit(0);
	}

}
