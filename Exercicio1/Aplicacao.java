import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Matematica matematica = new Matematica();
		
		System.out.print("Insira o Numero do Fatorial: ");
		System.out.println(matematica.fatorial(ler.nextInt()) + "\n");
		
		matematica.tabuada();
		
		System.out.println("Insira a Base e a Altura do Triangulo");
		matematica.areatriangulo(ler.nextDouble(), ler.nextDouble());
	
		ler.close();
		
	}

}
