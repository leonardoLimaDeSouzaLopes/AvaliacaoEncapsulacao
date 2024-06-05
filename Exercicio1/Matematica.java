import java.util.Scanner;

public class Matematica {
	
	private Scanner ler = new Scanner(System.in);

	public int fatorial(int numero) {

		int fatorial = 1;

		while (numero > 0) {

			fatorial *= numero;

			numero--;
		}

		return fatorial;
	}
	
	public void tabuada() {

		System.out.print("Insira o Numero da Tabuada: ");
		int numero = ler.nextInt();
		System.out.println("Tabuada:");

		int fator;
		
		for (fator = 0; fator <= 10; fator++) {

			System.out.println(String.format("%1d x %2d = %3d", numero, fator, numero*fator));

		}
		
		System.out.println();
		
	}
	
	public void areatriangulo (double base , double altura) {
		
		double areatriangulo = (base * altura) / 2 ;
		
		System.out.println(String.format("Area do Triangulo: %1.1f", areatriangulo));
		
	}

}
