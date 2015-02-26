package br.com.padroes.builder.ex5;

public interface BuilderLivro {
	void setTitulo(String titulo);
	void setAutor(String autor);
	
	Livro getLivro();
}
