package br.com.padroes.state.ex2;

public class Produto {
	private int id;
	private String descricao;
	private Double preco;
	private String unidade;
	
	public Produto(int id, String descricao, Double preco, String unidade) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.unidade = unidade;
	}

	public Produto() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco="
				+ preco + ", unidade=" + unidade + "]";
	}
}