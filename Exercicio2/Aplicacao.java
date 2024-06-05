import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Carro carro = new Carro();

		System.out.print("Insira o Modelo: ");
		carro.setModelo(ler.next());
		System.out.print("Insira a Fabricante: ");
		carro.setFabricante(ler.next());
		System.out.print("Insira o Ano de Fabricacao: ");
		carro.setAnoDeFabricacao(ler.next());
		
		System.out.println(String.format("Modelo: %1s\nFabricante: %2s\nAno de Fabricacao: %3s", carro.getModelo(), carro.getFabricante(), carro.getAnoDeFabricacao()));
		
		ler.close();
	}

}
