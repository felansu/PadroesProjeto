package br.com.padroes.observer.ex2;

public class Usuario implements AcaoObserver {

	private String login;

	public Usuario(String login) {
		super();
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public void avisar(Acao acao) {
		System.out.println(acao.getTipo() + " | Querido usuário "+ getLogin() +", o seu livro tem que ser devolvido dia: " + acao.getInformacao());
	}

}
