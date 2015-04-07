package br.com.padroes.builder.prova;

public class AnalistaDeSistemas implements Colaborador{

	@Override
	public Double calcularBonificacao(Double salario) {
		return salario*2;
	}

}
