package br.com.padroes.abstractfactorymethod.modelo;

public class AEComunicadorFactory  implements ComunicadorFactory{
	@Override public Emissor createEmissor() { return new EmissorAE();}
	@Override public Receptor createReceptor() {return new ReceptorAE();}
}