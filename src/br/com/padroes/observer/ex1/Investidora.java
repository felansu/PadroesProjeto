package br.com.padroes.observer.ex1;

public class Investidora implements AcaoObserver {

	private String nome;

	public Investidora(String nome) {
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