package br.com.padroes.observer.ex1;

public class Corretora implements AcaoObserver {

	private String nome;

	public Corretora(String nome) {
		this.nome = nome;
	}

	@Override
	public void notificaAlteracao(Acao acao) {
		System.out.println(getNome() + " A��o alterada para " + acao.getValor());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}