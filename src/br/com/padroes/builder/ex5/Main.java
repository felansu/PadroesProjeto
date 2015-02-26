package br.com.padroes.builder.ex5;

public class Main {
	public static void main(String[] args) {
		GeradorLivro gerador;
		gerador = new GeradorLivro(new BuilderLivroDoc());
		System.out.println(gerador.gerarLivro());
		
		gerador = new GeradorLivro(new BuilderLivroPdf());
		System.out.println(gerador.gerarLivro());
	}
}
