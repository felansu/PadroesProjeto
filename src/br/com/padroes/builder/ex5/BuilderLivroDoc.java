package br.com.padroes.builder.ex5;

public class BuilderLivroDoc implements BuilderLivro{
	String titulo;
	String autor;
	
	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public Livro getLivro() {
		return new LivroDoc();
	}

}
