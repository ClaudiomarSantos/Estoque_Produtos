package entidades;

public class Produto {
	public String nome;
	public double preço;
	public int quantidade;
	
	

	public Produto(String nome, double preço, int quantidade) {
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
	}

	public double ValorEmEstoque() {
		return preço * quantidade;

	}

	public void AdicProduto(int quantidade) {

		this.quantidade += quantidade;
	}

	public void RemoveProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return 	
				nome 
				+ ", $ " 
				+ String.format("%.2f%n", preço) 
				+ quantidade
				+ ", "
				+ String.format("%.2f%n", ValorEmEstoque());
	}

	
}
