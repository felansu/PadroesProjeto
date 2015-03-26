package br.com.padroes.facade;

public class PedidoItems {
	private int id;
	private double qtde;
	private Produto produto;

	public PedidoItems(int id, double qtde, Produto produto) {
		this.id = id;
		this.qtde = qtde;
		this.produto = produto;
	}

	public PedidoItems() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getQtde() {
		return qtde;
	}

	public void setQtde(double qtde) {
		this.qtde = qtde;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}