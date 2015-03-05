package br.com.padroes.builder.ex4GeradorImagens;

public class ImagemPNG implements Imagem{

	private String titulo;
	private String imagem;
	
	public ImagemPNG(String titulo, String imagem) {
		this.titulo = titulo;
		this.imagem = imagem;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getImagem() {
		return this.imagem;
	}
	
	public String toString(){
		return "Sou uma imagem PNG\n"
				+ "Titulo: "+titulo+ "- - - Imagem: "+imagem;
	}

}
