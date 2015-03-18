package br.com.padroes.abstractfactorymethod.modelo;

public interface ComunicadorFactory {
	public Emissor createEmissor();
	public Receptor createReceptor();
}