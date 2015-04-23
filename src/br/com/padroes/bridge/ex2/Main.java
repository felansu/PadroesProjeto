package br.com.padroes.bridge.ex2;

public class Main {
	public static void main(String[] args) {
		
		Boleto boleto = new BoletoBB(new GeradorBoletoDOC());
		boleto.gerarBoleto();
		boleto = new BoletoBB(new GeradorBoletoPDF());
		boleto.gerarBoleto();
		System.out.println();
		
		boleto = new BoletoBradesco(new GeradorBoletoPDF());
		boleto.gerarBoleto();
		boleto = new BoletoBradesco(new GeradorBoletoDOC());
		boleto.gerarBoleto();
		System.out.println();
		
		boleto = new BoletoItau(new GeradorBoletoDOC());
		boleto.gerarBoleto();
		boleto = new BoletoItau(new GeradorBoletoDOC());
		boleto.gerarBoleto();
		System.out.println();
		
		boleto = new BoletoSantander(new GeradorBoletoDOC());
		boleto.gerarBoleto();
		boleto = new BoletoSantander(new GeradorBoletoPDF());
		boleto.gerarBoleto();
		System.out.println();
	}
}
