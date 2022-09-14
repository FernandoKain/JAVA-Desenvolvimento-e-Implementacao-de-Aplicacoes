package cap05;

import java.util.Arrays;

public class ArrayOrdena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nomes = {"Fernando", "Zieg e Frida", "Fernanda", "Bandit", "Pierce", "Cookie"};
		char[] vogais = {'i', 'u', 'a', 'o',  'e'};
		int[] numeros = {9, 2, 6, 7, 5, 3, 4, 8, 1, 0};
		float[] notas = {7.6f, 8.5f, 9.7f, 5.4f, 7.4f};
		
		//Ordena os nomes em ordem alfab�tica
		Arrays.sort(nomes);
		System.out.print("\nNomes: ");
		for(String nome: nomes) {
			System.out.print(nome + ", ");
		}
		
		//Ordena as vogais em ordem alfab�tica
		Arrays.sort(vogais);
		System.out.print("\nVogais: ");
		for(char vogal: vogais) {
			System.out.print(vogal + ", ");
		}
		
		//Ordena os n�meros em ordem crescente
		Arrays.sort(numeros);
		System.out.print("\nN�meros: ");
		for(int numero: numeros) {
			System.out.print(numero + ", ");
		}
		
		//Ordena as notas em ordem crescente
		Arrays.sort(notas);
		System.out.print("\nNotas: ");
		for(float nota: notas) {
			System.out.print(nota + ", ");
		}
		

	}

}
