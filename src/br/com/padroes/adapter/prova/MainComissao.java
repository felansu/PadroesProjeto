package br.com.padroes.adapter.prova;

public class MainComissao {
	public static void main(String[] args) {
		Vendedor v = new Vendedor(1, "Diogo", "1234", "431");
		
		CalculaComissao.calculaComissaoNivelA(v);
		CalculaComissao.calculaComissaoNivelB(v);
		
		CalculaComissaoAdaptador.calculaComissaoNivelA(v);
		CalculaComissaoAdaptador.calculaComissaoNivelB(v);
	}
}
