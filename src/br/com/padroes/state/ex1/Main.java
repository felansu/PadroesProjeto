package br.com.padroes.state.ex1;

public class Main {
	public static void main(String[] args) {
		Taximetro b = new Taximetro();
		b.calcularCorrida(100D, new Bandeira1());
		b.calcularCorrida(100D, new Bandeira2());

		
	}
}
