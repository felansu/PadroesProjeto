package br.com.padroes.observer.ex1;

import java.util.List;

public class Acao {
	private String nome;
	private double valor;
	private List<AcaoObserver> listaObservadores;
	
	public Acao(String nome, double valor, List<AcaoObserver> listaObservadores) {
		this.nome = nome;
		this.valor = valor;
		this.listaObservadores = listaObservadores;
	}
	
	
	public void registraInteressados(AcaoObserver interessado){
		getListaObservadores().add(interessado);
	}
	
	public void deletarInteressados(AcaoObserver interessado){
		getListaObservadores().remove(interessado);
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		for (AcaoObserver observer : this.listaObservadores) {
			observer.notificaAlteracao(this);
		}
		this.valor = valor;
	}

	public List<AcaoObserver> getListaObservadores() {
		return listaObservadores;
	}

	public void setListaObservadores(List<AcaoObserver> listaObservadores) {
		this.listaObservadores = listaObservadores;
	}
	
	
	
}
