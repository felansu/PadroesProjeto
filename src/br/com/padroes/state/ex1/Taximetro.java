package br.com.padroes.state.ex1;

public class Taximetro {
	public Bandeira bandeira;

	public Taximetro(Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	
	public Taximetro() {
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	
	public void calcularCorrida(double km) {
		System.out.println("O valor da corrida é: " +getBandeira().calculaValorCorrida(km));
	}
	
	public void calcularCorrida(double km, Bandeira bandeira) {
		if (bandeira.getClass().isInstance(Bandeira1.class)) {
			System.out.println(new Bandeira1().calculaValorCorrida(km));
		}else if (bandeira.getClass().isInstance(Bandeira2.class)) {
			System.out.println(new Bandeira2().calculaValorCorrida(km));
		}
	}	
}