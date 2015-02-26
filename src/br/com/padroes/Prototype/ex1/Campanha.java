package br.com.padroes.Prototype.ex1;

public class Campanha implements Prototype<Campanha> {

	String titulo;
	String valor;
	String tempo;

	public Campanha(String titulo, String valor, String tempo) {
		this.titulo = titulo;
		this.valor = valor;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public Campanha clone() {
		return new Campanha(
				"Copia de campanha: "+titulo,
				"Copia de valor: " +this.valor,
				"Copia de tempo: " +tempo
				);
	}

	@Override
	public String toString() {
		return "Campanha [titulo=" + titulo + ", valor=" + valor + ", tempo="
				+ tempo + "]";
	}
	
}
