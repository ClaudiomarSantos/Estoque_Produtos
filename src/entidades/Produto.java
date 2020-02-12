package entidades;

public class Produto {
	private String nome;
	private double pre�o;
	private int quantidade;

	public Produto(String nome, double pre�o, int quantidade) {
		this.nome = nome;
		this.pre�o = pre�o;
		this.quantidade = quantidade;
	}

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
		return nome + ", $ " + String.format("%.2f%n", pre�o) + quantidade + ", "
				+ String.format("%.2f%n", ValorEmEstoque());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
