package br.com.padroes.bridge.ex3;

public class GeradorAvisoSMS implements GeradorAviso{

	@Override
	public void geradorAviso(String conteudo) {
		System.out.println("Gerando SMS "+conteudo);
	}
	
}
