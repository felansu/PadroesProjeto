package padroes.builder.ex4GeradorImagens;

public class GeradorImagem {
	private ImagemBuilder imagemBuilder;

	public GeradorImagem(ImagemBuilder imagemBuilder) {
		this.imagemBuilder = imagemBuilder;
	}
	
	public Imagem gerarImagem(){
		this.imagemBuilder.buildImagem("Imagem de uma cidade");
		this.imagemBuilder.buildTitulo("Cidade");
		return this.imagemBuilder.getImagem();
	}
}
