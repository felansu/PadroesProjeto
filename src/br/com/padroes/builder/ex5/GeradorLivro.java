package br.com.padroes.builder.ex5;

public class GeradorLivro {
	private BuilderLivro builder;

	public GeradorLivro(BuilderLivro builder) {
		this.builder = builder;
	}
	
	public String gerarLivro(){
		return this.builder.getLivro().toString();
	}
}
