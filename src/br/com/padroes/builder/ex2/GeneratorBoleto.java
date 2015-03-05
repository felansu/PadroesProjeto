package br.com.padroes.builder.ex2;

import java.util.Calendar;

public class GeneratorBoleto {

	private BoletoBuilder boletoBuilder;

	public GeneratorBoleto(BoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}

	public Boleto geraBoleto() {
		// informações sobre o boleto a ser gerado
		boletoBuilder.buildSacado("Camilo Lopes");
		boletoBuilder.buildCedente("Disney");
		boletoBuilder.buildValor(2000.00);
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 20);
		boletoBuilder.buildVencimento(vencimento);
		boletoBuilder.buildNossoNro(1234);
		// olha isso aqui que mágico
		Boleto boleto = boletoBuilder.getBoleto();
		return boleto;
	}
}
