package br.com.padroes.bridge.ex2;

public class GeradorBoletoDOC implements GeradorBoleto{

	@Override
	public void geradorBoleto(String conteudo) {
		System.out.println("Gerando boleto formato doc: " + conteudo);
	}

}
