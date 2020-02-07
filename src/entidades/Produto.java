package entidades;

public class Produto {
	public String nome;
	public double preço;
	public int quantidade;

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
