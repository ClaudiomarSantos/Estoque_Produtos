package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto prod = new Produto();

		System.out.print("digite o nome do produto: ");
		prod.nome = sc.nextLine();
		System.out.print("digite o preço: ");
		prod.preço = sc.nextDouble();
		System.out.println("quantidade em estoque: ");
		prod.quantidade = sc.nextInt();

System.out.println("Dados do produto: " + prod.toString());		
		
		
	sc.close();}

}
