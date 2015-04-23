package br.com.padroes.bridge.ex2;

public class GeradorBoletoPDF implements GeradorBoleto{

	@Override
	public void geradorBoleto(String conteudo) {
		System.out.println("Gerando boleto formato PDF: " + conteudo);
	}

}