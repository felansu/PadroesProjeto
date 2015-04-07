package br.com.padroes.adapter.prova;

public class CalculaComissaoAdaptador extends CalculaComissao {
	
	static void calculaComissaoNivelA(Vendedor vendedor) {
		new CalculaComissaoNovo().calculaComissao(1, vendedor);
	}

	static void calculaComissaoNivelB(Vendedor vendedor) {
		new CalculaComissaoNovo().calculaComissao(2, vendedor);
	}
}