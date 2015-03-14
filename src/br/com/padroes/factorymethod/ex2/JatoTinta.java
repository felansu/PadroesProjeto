package br.com.padroes.factorymethod.ex2;

public class JatoTinta implements Impressora{

	@Override
	public void imprimir(String texto) {
		System.out.printf("Imprimindo Jato de tinta: %s \n", texto);
	}
	
}