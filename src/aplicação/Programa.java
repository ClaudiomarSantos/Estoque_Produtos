package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto prod;

		System.out.print("digite o nome do produto: ");
		String nome = sc.nextLine();
		System.out.print("digite o preço: ");
		double preço = sc.nextDouble();
		System.out.println("quantidade em estoque: ");
		int quantidade = sc.nextInt();
		prod = new Produto(nome, preço, quantidade);

		System.out.println("Dados do produto: " + prod.toString());
		System.out.println("Entrada no estoque: ");

		quantidade = sc.nextInt();
		prod.AdicProduto(quantidade);

		System.out.println("Dados do produto: " + prod.toString());
		System.out.println("Saída no estoque: ");
		quantidade = sc.nextInt();
		prod.RemoveProduto(quantidade);

		System.out.println("Dados do produto: " + prod.toString());

		sc.close();
	}

}
