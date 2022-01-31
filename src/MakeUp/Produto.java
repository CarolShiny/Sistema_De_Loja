package MakeUp;

public class Produto {
	
	private String codigo;
	private String descricao;
	private double precoVenda;
	private int quantidadeEmEstoque;
	
	public Produto (String codigo, String descricao, double precoVenda, int quantidadeEmEstoque) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoVenda = precoVenda;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	

	public String toString() {
		return "C�digo: " + getCodigo() + "Descri��o: " +getDescricao() + "Pre�o: " + getPrecoVenda() + "Quantidade Em estoque: " + getQuantidadeEmEstoque();
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	

}
