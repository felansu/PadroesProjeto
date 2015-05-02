package br.com.padroes.state.ex2;

public class CorrecaoPreco1 implements CorrecaoPreco {

	@Override
	public Produto corrigirPreco(Produto produto) {
		produto.setPreco(1.0 + produto.getPreco());
		return produto;
	}

}
