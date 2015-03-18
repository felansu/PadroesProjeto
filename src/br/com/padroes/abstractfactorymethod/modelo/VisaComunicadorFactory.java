package br.com.padroes.abstractfactorymethod.modelo;

public class VisaComunicadorFactory implements ComunicadorFactory{
	@Override public Emissor createEmissor() {return new EmissorVisa();}
	@Override public Receptor createReceptor() {return new ReceptorVisa();}
}