package br.com.padroes.adapter.prova;

public class CalculaComissaoNovo {
	private static final Integer TIPO_A = 1;
	private static final Integer TIPO_B = 2;

	public void calculaComissao(Integer tipo, Vendedor vendedor) {
		if (tipo.equals(TIPO_A)) {
			System.out.println("CALCULANDO COMISSAO NIVEL A NOVO "+ vendedor.getNome());
		} else if (tipo.equals(TIPO_B)) {
			System.out.println("CALCULANDO COMISSAO NIVEL B NOVO "+ vendedor.getNome());
		}
	}
}
