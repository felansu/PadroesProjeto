package br.com.padroes.bridge.ex3;

public class AvisoDevolucao implements Aviso{

	private GeradorAviso gerador;
	
	public AvisoDevolucao(GeradorAviso gerador) {
		this.gerador = gerador;
	}

	@Override
	public void enviarAviso() {
		this.gerador.geradorAviso("Tem que devolver o livro man !");
	}
}
