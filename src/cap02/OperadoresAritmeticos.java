package cap02;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// declara��o e inicializa��o de vari�veis
		int x = 10;
		int y = 3;
		
		// v�rias opera��es com as vari�veis
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("-X = " + (-x));
		System.out.println("X/Y = " + (x / y));
		System.out.println("Resto de X por Y = " + (x % y)); // resulta 1
		System.out.println("Inteiro de X por Y = " + (int)(x / y)); // resulta 3
		System.out.println("X + 1 = " + (++x)); // resulta 11
		

	}

}
