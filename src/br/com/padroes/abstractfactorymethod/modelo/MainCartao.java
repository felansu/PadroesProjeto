package br.com.padroes.abstractfactorymethod.modelo;

public class MainCartao {
	public static void main(String[] args) {
		CriacaoDoComunicador.getComunicador(1).createEmissor().realizarEmissao();
		CriacaoDoComunicador.getComunicador(2).createEmissor().realizarEmissao();
		CriacaoDoComunicador.getComunicador(3).createEmissor().realizarEmissao();

		CriacaoDoComunicador.getComunicador(1).createReceptor().realizarRecepcao();
		CriacaoDoComunicador.getComunicador(2).createReceptor().realizarRecepcao();
		CriacaoDoComunicador.getComunicador(3).createReceptor().realizarRecepcao();
	}
}
