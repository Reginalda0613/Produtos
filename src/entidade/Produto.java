package entidade;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque(){
		return preco * quantidade;	
	}
	
	public  void addProdutos(int quantidade) {
		/*para referenciar o produto da classe usa o this(referencia o objeto)
		pois, o paramentro e argumento tem mesmo nome */
		this.quantidade += quantidade;	
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	//toString implementa a forma de String. sobre poe a string
	
	public String toString() {
		return nome
				+ ", R$ "
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidades, Total: R$ "
				+ String.format("%.2f",totalValorEmEstoque());
	}
}
