package br.com.padroes.state.ex2;

import java.util.List;

public class TabelaPreco {
	private int id;
	private String descricao;
	private CorrecaoPreco correcao;
	private List<Produto> produtos;

	public TabelaPreco(int id, String descricao, CorrecaoPreco correcao,
			List<Produto> produtos) {
		this.id = id;
		this.descricao = descricao;
		this.correcao = correcao;
		this.produtos = produtos;
	}

	public TabelaPreco() {
	}

	
	
	public void imprimirProduto() {
		for (Produto produto : produtos) {
			getCorrecao().corrigirPreco(produto);
			System.out.println(produto.toString());
		}
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

	public CorrecaoPreco getCorrecao() {
		return correcao;
	}

	public void setCorrecao(CorrecaoPreco correcao) {
		this.correcao = correcao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}