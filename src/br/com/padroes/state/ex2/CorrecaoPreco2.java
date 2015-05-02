package br.com.padroes.state.ex2;

public class CorrecaoPreco2 implements CorrecaoPreco {

	@Override
	public Produto corrigirPreco(Produto produto) {
		produto.setPreco(2.0 + produto.getPreco());
		return produto;
	}

}
