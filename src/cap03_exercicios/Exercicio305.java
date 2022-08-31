package cap03_exercicios;

import javax.swing.JOptionPane;

public class Exercicio305 {

	public static void main(String[] args) {
		/* Elabore uma classe que apresente uma esp�cie de menu usando JOptionPane. 
		 * Para cada op��o escolhida, execute um dos exerc�cios anteriores.
		 * Veja a Tabela 3.2 (vide p�gina 68) e um exemplo de execu��o na Figura 3.20 (vide p�gina 68)
		 */
		
		String aux;
		int opcao_de_exercicio;
		
		aux = JOptionPane.showInputDialog("Forne�a uma op��o de exerc�cio:\n "
				+ "1 - Exerc�cio 1 - C�lculo de desconto\n"
				+ "2 - Exerc�cio 2 - Maior/menor e Resist�ncia Total\n"
				+ "3 - Exerc�cio 3 - Login e senha\n"
				+ "4 - Exerc�cio 4 - Tabuada");
		opcao_de_exercicio = Integer.parseInt(aux);
		
		if(opcao_de_exercicio == 1) {
			Exercicio301();
		}else if(opcao_de_exercicio == 2) {
			Exercicio302();
		}else if(opcao_de_exercicio == 3) {
			Exercicio303();
		}else if(opcao_de_exercicio == 4) {
			Exercicio304();
		}
		
		
	}

	private static void Exercicio304() {
		// TODO Auto-generated method stub
		
int numero_desejado;
		
		String aux = JOptionPane.showInputDialog("Forne�a um n�mero para saber a sua tabuada: ");
		numero_desejado = Integer.parseInt(aux);
		
		JOptionPane.showMessageDialog(null, 
				numero_desejado + " x 1 = " + (numero_desejado * 1) +"\n" + 
				numero_desejado + " x 2 = " + (numero_desejado * 2) +"\n" +
				numero_desejado + " x 3 = " + (numero_desejado * 3) +"\n" +
				numero_desejado + " x 4 = " + (numero_desejado * 4) +"\n" +
				numero_desejado + " x 5 = " + (numero_desejado * 5) +"\n" +
				numero_desejado + " x 6 = " + (numero_desejado * 6) +"\n" +
				numero_desejado + " x 7 = " + (numero_desejado * 7) +"\n" +
				numero_desejado + " x 8 = " + (numero_desejado * 8) +"\n" +
				numero_desejado + " x 9 = " + (numero_desejado * 9) +"\n" +
				numero_desejado + " x 10 = " + (numero_desejado * 10) +"\n");
		
	}
		

	private static void Exercicio303() {
		// TODO Auto-generated method stub
		
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


	private static void Exercicio302() {
		// TODO Auto-generated method stub
		
		float RE;
		float r1, r2, r3, r4;
		float maior;
		float menor;
		String aux;
		
		aux = JOptionPane.showInputDialog("Insira o valor da resist�ncia r1: ");
		r1 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Insira o valor da resist�ncia r2: ");
		r2 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Insira o valor da resist�ncia r3: ");
		r3 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Insira o valor da resist�ncia r4: ");
		r4 = Float.parseFloat(aux);
		
		RE = r1 + r2 + r3 + r4;
		
			
			if(r1 <= r2 && r1 <= r3 && r1 <= r4) {
				menor = r1;
				
			}else if (r2 <= r1 && r2 <= r3 && r2 <= r4) {
				menor = r2;
				
			}else if (r3 <= r1 && r3 <= r2 && r3 <= r4) {
				menor = r3;
				
			}else if (r4 <= r1 && r4 <= r2 && r4 <= r3) {
				menor = r4;
			}else {
				menor=0;
			}
			
			
			if(r1 >= r2 && r1 >= r3 && r1 >= r4) {
				maior = r1;
				
			}else if (r2 >= r1 && r2 >= r3 && r2 >= r4) {
				maior = r2;
				
			}else if (r3 >= r1 && r3 >= r2 && r3 >= r4) {
				maior = r3;
				
			}else if (r4 >= r1 && r4 >= r2 && r4 >= r3) {
				maior = r4;
			}else{
				maior = 0;
			}
			
			JOptionPane.showMessageDialog(null, "Resist�ncias fornecidas: \n" + r1 + ", " + r2 + ", " + r3 + ", " + r4 
					+ ".\n" + "A menor resist�ncia �: " + menor + "\nA maior resist�ncia �: " + maior + 
					"\nE a soma das resist�ncias �: " + RE);
			
	}
		


	private static void Exercicio301() {
		// TODO Auto-generated method stub
		
		String nome_do_produto;
		float valor_do_produto;
		float valor_do_produto_com_desconto;
		int desconto;
		String aux;
		
		aux = JOptionPane.showInputDialog("Insira o nome do produto: ");
		nome_do_produto = aux;
		
		aux = JOptionPane.showInputDialog("Insira o valor do produto: ");
		valor_do_produto = Float.parseFloat(aux);
		

				if (valor_do_produto >= 50 && valor_do_produto <= 200) {
					desconto = 5;
					valor_do_produto_com_desconto = valor_do_produto - (valor_do_produto * desconto / 100);
					JOptionPane.showMessageDialog(null, "Nome do produto: " + nome_do_produto + "\nValor original do produto: " 
							+ valor_do_produto + "\nValor do produto com desconto: " + valor_do_produto_com_desconto);
					
				}else if(valor_do_produto >= 200 && valor_do_produto < 500) {
					desconto = 6;
					valor_do_produto_com_desconto = - (valor_do_produto * desconto / 100);
					JOptionPane.showMessageDialog(null, "Nome do produto: " + nome_do_produto + "\nValor original do produto: " 
							+ valor_do_produto + "\nValor do produto com desconto: " + valor_do_produto_com_desconto);
					
				}else if(valor_do_produto >= 500 && valor_do_produto < 1000) {
					desconto = 7;
					valor_do_produto_com_desconto = valor_do_produto - (valor_do_produto * desconto / 100);
					JOptionPane.showMessageDialog(null, "Nome do produto: " + nome_do_produto + "\nValor original do produto: " 
							+ valor_do_produto + "\nValor do produto com desconto: " + valor_do_produto_com_desconto);
					
				}else if(valor_do_produto >= 1000) {
					desconto = 8;
					valor_do_produto_com_desconto = valor_do_produto - (valor_do_produto * desconto / 100);
					JOptionPane.showMessageDialog(null, "Nome do produto: " + nome_do_produto + "\nValor original do produto: " 
							+ valor_do_produto + "\nValor do produto com desconto: " + valor_do_produto_com_desconto);
				}
		
	}
}

