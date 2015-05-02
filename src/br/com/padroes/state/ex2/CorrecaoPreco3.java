package br.com.padroes.state.ex2;

public class CorrecaoPreco3 implements CorrecaoPreco {

	@Override
	public Produto corrigirPreco(Produto produto) {
		produto.setPreco(3.0 + produto.getPreco());
		return produto;
	}

}
