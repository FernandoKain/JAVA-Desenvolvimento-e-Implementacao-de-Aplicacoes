package cap03_exercicios;

import javax.swing.JOptionPane;

public class Exercicio303 {

	public static void main(String[] args) {
		/* Fa�a uma classe que solicite login e senha, simulando o acesso a um sistema. 
		 * Considere que os conte�dos de login e senha originais s�o igiais a "java". O usu�rio dever� 
		 * fornecer login e senha e voc� ir� compar�-los com os conte�dos originais. O usu�rio tem tr�s 
		 * chances para digitar corretamente os dados de login e senha. Para cada tentativa incorreta deve 
		 * aparecer uma mensagem alertando o erro e apresentando a quantidade de tentativas que ainda restam. Veja um exemplo 
		 * de execu��o na Figura 3.18 (p�gina67), em que o usu�rio j� digitou o login e senha incorretos por duas vezes, restando 
		 * apenas uma �ltima chance.
		 */
		
		String login = "java";
		String senha = login;
		String aux;
		String login_digitado;
		String senha_digitada;
		int tentativas = 3;
		
		aux = JOptionPane.showInputDialog("Forne�a o login: ");
		login_digitado = aux;
		
		aux = JOptionPane.showInputDialog("Forne�a a senha: ");
		senha_digitada= aux;
		
		if(login_digitado.equals(login_digitado) && senha_digitada.equals(senha)) {
			JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
		}else {
			tentativas = tentativas -1;
			JOptionPane.showMessageDialog(null, "Falha, verifique login e senha! \nVoc� tem mais " +tentativas+ " tentativa(s)!");
			
			aux = JOptionPane.showInputDialog("Forne�a o login: ");
			login_digitado = aux;
			
			aux = JOptionPane.showInputDialog("Forne�a a senha: ");
			senha_digitada= aux;
			
			if(login_digitado.equals(login_digitado) && senha_digitada.equals(senha)) {
				JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
				
			}else {
				tentativas = tentativas -1;
				JOptionPane.showMessageDialog(null, "Falha, verifique login e senha! \nVoc� tem mais " +tentativas+ " tentativa(s)!");
				
				aux = JOptionPane.showInputDialog("Forne�a o login: ");
				login_digitado = aux;
				
				aux = JOptionPane.showInputDialog("Forne�a a senha: ");
				senha_digitada= aux;
				
				if(login_digitado.equals(login_digitado) && senha_digitada.equals(senha)) {
					JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
				}else {
					JOptionPane.showMessageDialog(null, "N�mero de tentativas excedido. Fim do programa!");
				}
			}
		
		}
		

	}

}
