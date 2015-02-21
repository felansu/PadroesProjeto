package padroes.builder.ex4GeradorImagens;

public class ImagemJPGBuilder implements ImagemBuilder{
	
	private String titulo;
	private String imagem;

	@Override
	public void buildTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public void buildImagem(String imagem) {
		this.imagem = imagem;
	}

	@Override
	public Imagem getImagem() {
		return new ImagemJPG(titulo, imagem);
	}

}
