package br.com.padroes.builder.ex4GeradorImagens;

public class ImagemJPG implements Imagem{
	private String titulo;
	private String imagem;
	
	public ImagemJPG(String titulo, String imagem) {
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
		return "Sou uma imagem JPG\n"
				+ "Titulo: "+titulo+ "- - - Imagem: "+imagem;
	}

}
