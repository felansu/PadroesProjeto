package br.com.padroes.strategy.ex2;

public class FreteDistritoFederal implements Frete {

	@Override
	public double calcularFrete(double valor) {
		return (valor * 0.40);

	}

}
