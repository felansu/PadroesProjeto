package br.com.padroes.builder.ex5;

public class LivroPdf implements Livro {
	String titulo;
	String autor;
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	@Override
	public String toString(){
		return "Isto é um PDF";
	}
	
	


}
