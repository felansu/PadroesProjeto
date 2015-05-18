package br.com.padroes.strategy.ex2;

public class TransporteItens {

	private int qtde;
	private Produto produto;

	public TransporteItens(int qtde, Produto produto) {
		super();
		this.qtde = qtde;
		this.produto = produto;
	}

	public TransporteItens() {
		super();
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
