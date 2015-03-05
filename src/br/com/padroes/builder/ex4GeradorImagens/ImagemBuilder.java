package br.com.padroes.builder.ex4GeradorImagens;

public interface ImagemBuilder {
	void buildTitulo(String titulo);
	void buildImagem(String imagem);
	
	Imagem getImagem();
}
