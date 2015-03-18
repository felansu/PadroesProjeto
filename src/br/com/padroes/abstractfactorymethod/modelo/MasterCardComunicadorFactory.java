package br.com.padroes.abstractfactorymethod.modelo;

public class MasterCardComunicadorFactory implements ComunicadorFactory{
	@Override public Emissor createEmissor() { return new EmissorMasterCard();}
	@Override public Receptor createReceptor() {return new ReceptorMasterCard();}
}