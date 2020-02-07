package entidades;

public class Produto {
	public String nome;
	public double pre�o;
	public int quantidade;

	public double ValorEmEstoque() {
		return pre�o * quantidade;

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
				+ String.format("%.2f%n", pre�o) 
				+ quantidade
				+ ", "
				+ String.format("%.2f%n", ValorEmEstoque());
	}

}
