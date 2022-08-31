package cap03_exercicios;

import javax.swing.JOptionPane;

public class Exercicio303 {

	public static void main(String[] args) {
		/* Faça uma classe que solicite login e senha, simulando o acesso a um sistema. 
		 * Considere que os conteúdos de login e senha originais são igiais a "java". O usuário deverá 
		 * fornecer login e senha e você irá compará-los com os conteúdos originais. O usuário tem três 
		 * chances para digitar corretamente os dados de login e senha. Para cada tentativa incorreta deve 
		 * aparecer uma mensagem alertando o erro e apresentando a quantidade de tentativas que ainda restam. Veja um exemplo 
		 * de execução na Figura 3.18 (página67), em que o usuário já digitou o login e senha incorretos por duas vezes, restando 
		 * apenas uma última chance.
		 */
		
		String login = "java";
		String senha = login;
		String aux;
		String login_digitado;
		String senha_digitada;
		int tentativas = 3;
		
		aux = JOptionPane.showInputDialog("Forneça o login: ");
		login_digitado = aux;
		
		aux = JOptionPane.showInputDialog("Forneça a senha: ");
		senha_digitada= aux;
		
		if(login_digitado.equals(login_digitado) && senha_digitada.equals(senha)) {
			JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
		}else {
			tentativas = tentativas -1;
			JOptionPane.showMessageDialog(null, "Falha, verifique login e senha! \nVocê tem mais " +tentativas+ " tentativa(s)!");
			
			aux = JOptionPane.showInputDialog("Forneça o login: ");
			login_digitado = aux;
			
			aux = JOptionPane.showInputDialog("Forneça a senha: ");
			senha_digitada= aux;
			
			if(login_digitado.equals(login_digitado) && senha_digitada.equals(senha)) {
				JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
				
			}else {
				tentativas = tentativas -1;
				JOptionPane.showMessageDialog(null, "Falha, verifique login e senha! \nVocê tem mais " +tentativas+ " tentativa(s)!");
				
				aux = JOptionPane.showInputDialog("Forneça o login: ");
				login_digitado = aux;
				
				aux = JOptionPane.showInputDialog("Forneça a senha: ");
				senha_digitada= aux;
				
				if(login_digitado.equals(login_digitado) && senha_digitada.equals(senha)) {
					JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
				}else {
					JOptionPane.showMessageDialog(null, "Número de tentativas excedido. Fim do programa!");
				}
			}
		
		}
		

	}

}
