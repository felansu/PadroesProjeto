package br.com.padroes.bridge.ex3;

public class GeradorAvisoEmail implements GeradorAviso{

	@Override
	public void geradorAviso(String conteudo) {
		System.out.println("Gerando EMAIL "+conteudo);
	}

}
