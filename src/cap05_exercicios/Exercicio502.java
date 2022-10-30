<<<<<<< HEAD
package cap05_exercicios;

import java.util.Random;

public class Exercicio502 {

	public static void main(String[] args) {
		/* Crie uma classe que armazene os 12 meses do ano
		 * em um array. A seguir, gere um valor randômico entre 0 e 11 e apresente 
		 * o mês correspondente do valor sorteado. Considere que o valor 0 
		 * corresponde ao mês de janeiro e o valor 11, ao mês de dezembro.
		 */
		
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		Random random = new Random(); //Cria o objeto random
		int mes_aletorio = random.nextInt(11); //Sorteia um número inteiro entre 0 e 11
		System.out.println(mes_aletorio); //Imprime na tela o número aleatório sorteado
		
		switch (mes_aletorio){
		case 0: System.out.println(meses[0]); break;
		case 1: System.out.println(meses[1]); break;
		case 2: System.out.println(meses[2]); break;
		case 3: System.out.println(meses[3]); break;
		case 4: System.out.println(meses[4]); break;
		case 5: System.out.println(meses[5]); break;
		case 6: System.out.println(meses[6]); break;
		case 7: System.out.println(meses[7]); break;
		case 8: System.out.println(meses[8]); break;
		case 9: System.out.println(meses[9]); break;
		case 10: System.out.println(meses[10]); break;
		case 11: System.out.println(meses[11]); break;
		case 12: System.out.println(meses[12]); break;
		}
		
	
		
	}

}
=======
package cap05_exercicios;

import java.util.Random;

public class Exercicio502 {

	public static void main(String[] args) {
		/* Crie uma classe que armazene os 12 meses do ano
		 * em um array. A seguir, gere um valor randômico entre 0 e 11 e apresente 
		 * o mês correspondente do valor sorteado. Considere que o valor 0 
		 * corresponde ao mês de janeiro e o valor 11, ao mês de dezembro.
		 */
		
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		Random random = new Random(); //Cria o objeto random
		int mes_aletorio = random.nextInt(11); //Sorteia um número inteiro entre 0 e 11
		System.out.println(mes_aletorio); //Imprime na tela o número aleatório sorteado
		
		switch (mes_aletorio){
		case 0: System.out.println(meses[0]); break;
		case 1: System.out.println(meses[1]); break;
		case 2: System.out.println(meses[2]); break;
		case 3: System.out.println(meses[3]); break;
		case 4: System.out.println(meses[4]); break;
		case 5: System.out.println(meses[5]); break;
		case 6: System.out.println(meses[6]); break;
		case 7: System.out.println(meses[7]); break;
		case 8: System.out.println(meses[8]); break;
		case 9: System.out.println(meses[9]); break;
		case 10: System.out.println(meses[10]); break;
		case 11: System.out.println(meses[11]); break;
		case 12: System.out.println(meses[12]); break;
		}
		
	
		
	}

}
>>>>>>> 618109f7372b190421319bb6a0dc6fc6d9bab963
