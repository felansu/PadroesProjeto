package br.com.padroes.state.ex2;

import java.util.ArrayList;
import java.util.List;

public class MainProdutos {
	
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();

		produtos.add(new Produto(1, "Produto 1", 10.1, "KG"));
		produtos.add(new Produto(2, "Produto 2", 10.2, "KG"));
		produtos.add(new Produto(3, "Produto 3", 10.3, "KG"));

		new TabelaPreco(1, "Preco novo", new CorrecaoPreco1(), produtos).imprimirProduto();
		new TabelaPreco(1, "Preco novo", new CorrecaoPreco2(), produtos).imprimirProduto();
		new TabelaPreco(1, "Preco novo", new CorrecaoPreco3(), produtos).imprimirProduto();

	}
	
}
