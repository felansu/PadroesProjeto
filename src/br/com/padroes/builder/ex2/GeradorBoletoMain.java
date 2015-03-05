package br.com.padroes.builder.ex2;

public class GeradorBoletoMain {
	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new ItauBoletoBuilder();
		GeneratorBoleto generatorBoleto = new GeneratorBoleto(boletoBuilder); // itau
		Boleto boleto = generatorBoleto.geraBoleto();// retorna o boleto pronto
		System.out.println(boleto);
	}
}
