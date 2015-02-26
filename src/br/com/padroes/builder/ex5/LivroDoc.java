package br.com.padroes.builder.ex5;

public class LivroDoc implements Livro{
	String titulo;
	String autor;
	
	@Override
	public String getTitulo() {
		return titulo;
	}

	@Override
	public String getAutor() {
		return autor;
	}
	
	public String toString() {
	return "Este é um livro Doc";
	}
	
}
