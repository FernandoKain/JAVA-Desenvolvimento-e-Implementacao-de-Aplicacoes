package cap03;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class UsoDoThrows {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String frase = JOptionPane.showInputDialog("Entre com uma frase: ");
		
		try {
			
			FileWriter file = new FileWriter("c:/temp/frases.txt", true);
			PrintWriter out = new PrintWriter(file);
			out.println(frase);
			file.close();
			out.close();
			
			JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo!");
			
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Erro, verifique se a pasta c:/temp existe.\nCaso não exista, crie uma no referido diretório.");
		}

	}

}
