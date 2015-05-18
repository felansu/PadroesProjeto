package br.com.padroes.observer.ex2;

import java.util.List;

public class Acao {

	private String tipo;
	private String informacao;
	private List<AcaoObserver> observers;

	public Acao(String tipo, String informacao, List<AcaoObserver> observers) {
		this.tipo = tipo;
		this.informacao = informacao;
		this.observers = observers;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
		for (AcaoObserver observer : observers) {
			observer.avisar(this);
		}
	}

	public List<AcaoObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<AcaoObserver> observers) {
		this.observers = observers;
	}
	
	public void adicionarObservador(AcaoObserver observer){
		getObservers().add(observer);
	}
	public void removerObservador(AcaoObserver observer){
		getObservers().remove(observer);
	}
	
}