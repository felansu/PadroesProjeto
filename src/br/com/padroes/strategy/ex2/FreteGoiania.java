package br.com.padroes.strategy.ex2;

public class FreteGoiania implements Frete {

	@Override
	public double calcularFrete(double valor) {
		return (valor * 0.02);

	}

}
